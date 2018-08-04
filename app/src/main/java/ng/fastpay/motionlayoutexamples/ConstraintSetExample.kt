package ng.fastpay.motionlayoutexamples

import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.constraint.ConstraintSet
import android.transition.TransitionManager
import kotlinx.android.synthetic.main.activity_constraint_set_example.*

class ConstraintSetExample : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constraint_set_example)
        animateConstraints()
    }

    private fun animateConstraints() {
        var set = false
        val constraint1 = ConstraintSet()
        constraint1.clone(root)
        val constraint2 = ConstraintSet()
        constraint2.clone(this, R.layout.activity_constraint_set_example_alt)

        imageView.setOnClickListener {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                TransitionManager.beginDelayedTransition(root)

                TransitionManager.beginDelayedTransition(root)
                val constraint = if(set) constraint1 else constraint2
                constraint.applyTo(root)
                set = !set
            }
        }

    }
}
