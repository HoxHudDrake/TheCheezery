package verdugo.rene.thecheezery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_menu.*

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        btn_colddrinks.setOnClickListener {
            var intent = Intent(this, ProductosActivity::class.java)
            startActivity(intent)
        }

        btn_hotdrinks.setOnClickListener {
            var intent = Intent(this, HotDrinks::class.java)
            startActivity(intent)
        }

        btn_sweets.setOnClickListener {
            var intent = Intent(this, Sweets::class.java)
            startActivity(intent)
        }

        btn_salties.setOnClickListener {
            var intent = Intent(this, Salties::class.java)
            startActivity(intent)
        }

        btn_combos.setOnClickListener {
            var intent = Intent(this, Combos::class.java)
            startActivity(intent)
        }
    }
}
