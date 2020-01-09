package br.com.alura.app_tcc.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import br.com.alura.app_tcc.R
import br.com.alura.app_tcc.model.User
import kotlinx.android.synthetic.main.item_usuario.view.*

class ListaUsuariosAdapter(
    private val usuarios: List<User>,
    private val context: Context
) : BaseAdapter() {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val viewCriada = LayoutInflater.from(context)
            .inflate(R.layout.item_usuario, parent, false)

        val usuario = usuarios[position]

        adicionaNome(usuario, viewCriada)
        adicionaEmail(usuario, viewCriada)
        adicionaTelefone(usuario, viewCriada)

        return  viewCriada
    }

    private fun adicionaNome(usuario: User, viewCriada: View) {
        viewCriada.item_usuario_nome.text = usuario.nome
    }

    private fun adicionaEmail(usuario: User, viewCriada: View) {
        viewCriada.item_usuario_email.text = usuario.email
    }

    private fun adicionaTelefone(usuario: User, viewCriada: View) {
        viewCriada.item_usuario_telefone.text = usuario.telefone
    }
    override fun getItem(position: Int): User {
        return usuarios[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return usuarios.size
    }

}
