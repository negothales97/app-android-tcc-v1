package br.com.alura.app_tcc.ui.activity

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import br.com.alura.app_tcc.R
import br.com.alura.app_tcc.model.User
import kotlinx.android.synthetic.main.formulario_usuario.*

class FormActivity : AppCompatActivity(){
    private val users :MutableList<User> = mutableListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.formulario_usuario)


        botao_salvar_usuario.setOnClickListener {

            val email = form_usuario_email.text.toString()
            val nome = form_usuario_nome.text.toString()
            val telefone = form_usuario_telefone.text.toString()
            val user = User(nome, email, telefone)
            users.add(user)
            Toast.makeText(this, email, Toast.LENGTH_SHORT).show()
        }
    }
}
