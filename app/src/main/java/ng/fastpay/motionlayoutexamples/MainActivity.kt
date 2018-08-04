package ng.fastpay.motionlayoutexamples

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_start_constraint_set.setOnClickListener {
            startActivity(Intent(this, ConstraintSetExample::class.java))
        }

        button_start_motion_layout.setOnClickListener {
            startActivity(Intent(this, MotionLayoutExample::class.java))
        }
    }
}
