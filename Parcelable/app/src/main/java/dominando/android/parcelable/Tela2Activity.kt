package dominando.android.parcelable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Tela2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela2)

        val nome = intent.getStringExtra("nome")
        val idade = intent.getIntExtra("idade", -1)

        val cliente = intent.getParcelableExtra<Cliente>("cliente")

        val text = findViewById<TextView>(R.id.textMensagem)

        text.text = if (cliente != null) {
            "Nome: ${cliente.nome} / Código:${cliente.codigo}"
        } else {
            "Nome: $nome / Idade: $ idade"
        }

    }
}