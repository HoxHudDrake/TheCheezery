package verdugo.rene.thecheezery

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.activity_combos.*
import kotlinx.android.synthetic.main.combo_view.view.*

class Combos : AppCompatActivity() {

    var salties = ArrayList<Product>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_combos)


        cargarProductos()

        var adaptador = AdaptadorProductos(this, salties)

        gridview.adapter = adaptador

    }



    fun cargarProductos(){
        salties.add(
            Product(
                "Combo 1",
                R.drawable.carljr1,
                "Classic combo, hamburguer with cheese, soda and french fries, medium Size",
                6
            )
        )

        salties.add(
            Product(
                "Combo 2",
                R.drawable.carljr2,
                "A delicious hamburguer with cheese served with french fries and soda",
                5
            )
        )

        salties.add(
            Product(
                "Combo 3",
                R.drawable.`as`,
                "California classic cheeseburguer, includes french fries and soda.",
                4
            )
        )

        salties.add(
            Product(
                "Combo 4",
                R.drawable.carljr4,
                "Hamburguer with beacon, cheese, veggies and only includes french fries",
                6
            )
        )


    }

    private class AdaptadorProductos: BaseAdapter {
        var productos = ArrayList<Product>()
        var contexto: Context? = null

        constructor(contexto: Context, productos: ArrayList<Product>){
            this.contexto = contexto
            this.productos = productos
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            var prod = productos[position]
            var inflador = LayoutInflater.from(contexto)
            var vista = inflador.inflate(R.layout.combo_view, null)

            vista.iv_imagen.setImageResource(prod.image)
            vista.tv_titulo.setText(prod.name)
            vista.tv_desc.setText(prod.description)

            return vista
        }

        override fun getItem(position: Int): Any {
            return productos[position]
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getCount(): Int {
            return productos.size
        }

    }
}
