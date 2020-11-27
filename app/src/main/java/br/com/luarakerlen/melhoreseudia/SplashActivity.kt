package br.com.luarakerlen.melhoreseudia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        //Programando a troca de tela após alguns segundos
        Handler(Looper.getMainLooper()).postDelayed({
            //Criando a intenção (intent) de trocar de tela
            val mIntent = Intent(this, MainActivity::class.java)

            //Iniciar a próxima tela
            startActivity(mIntent)

            //Finalizando a tela Splash
            finish()

        }, 2500)
    }
}