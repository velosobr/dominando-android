package dominando.android.parcelable

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.buttonParcel)

        button.setOnClickListener {
            val cliente = Cliente(1, "Lino'")

            val intent = Intent(this, Tela2Activity::class.java)
            intent.putExtra("cliente", cliente)

            startActivity(intent)
        }
    }
}