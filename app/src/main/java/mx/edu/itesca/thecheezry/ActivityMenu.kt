package mx.edu.itesca.thecheezry

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ActivityMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        var btncoolDrinks: Button = findViewById(R.id.coldDrinks) as Button
        var btnhotDrinks: Button = findViewById(R.id.hotDrinks) as Button
        var btnsweets: Button = findViewById(R.id.sweets) as Button
        var btnsalties: Button = findViewById(R.id.salties) as Button

        btncoolDrinks.setOnClickListener{
            var intent : Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType","coldDrinks")
            startActivity(intent)
        }
        btnhotDrinks.setOnClickListener{
            var intent : Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType","hotDrinks")
            startActivity(intent)
        }
        btnsweets.setOnClickListener{
            var intent : Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType","sweets")
            startActivity(intent)
        }
        btnsalties.setOnClickListener{
            var intent : Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType","salties")
            startActivity(intent)
        }

    }
}