package br.com.alura.app_tcc

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.alura.app_tcc.adapter.ListaUsuariosAdapter
import br.com.alura.app_tcc.model.User
import br.com.alura.app_tcc.ui.activity.FormActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private val users : MutableList<User> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        configuraBotaoAdicionar()
        configuraLista(users)
    }

    private fun configuraBotaoAdicionar() {
        botao_novo_usuario.setOnClickListener {
            val intent = Intent(this, FormActivity::class.java)
            startActivity(intent)
        }
    }

    private fun configuraLista(usuarios: List<User>) {
        lista_usuarios_listview.adapter = ListaUsuariosAdapter(usuarios, this)
    }
}
