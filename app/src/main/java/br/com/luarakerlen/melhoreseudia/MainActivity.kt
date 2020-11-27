package br.com.luarakerlen.melhoreseudia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Frases iniciais
        val listaInicial = arrayListOf<String>(
            "Não importa o que você decidiu. O que importa é que isso te faça feliz.",
            "Antes de você falar, ouça. Antes de agir, pense. Antes de criticar, conheça. E antes de desistir, tente.",
            "Já que os bons momentos da vida sempre passam rápido, faço o possível para que sejam inesquecíveis e acompanhados de muitos sorrisos.",
            "Você tem o direito de falar o que pensa, mas não tem o direito de julgar quem não conhece.",
            "O Tempo passa tão rápido, pessoas entram e saem da sua vida. Você nunca deve perder a oportunidade de dizer a essas pessoas o quanto eles significam para você.",
            "Você faz suas escolhas, e suas escolhas fazem você.",
            "Os melhores momentos na vida são como os arcos-íris: aparecem quando você menos espera.",
            "A felicidade não está na linha de chegada. A felicidade está no caminho.",
            "Sábio é aquele que não perde tempo tentando entender e se dedica a viver!",
            "A alegria não está nas coisas, está em nós."
        )
        val maxInicial = listaInicial.size-1
        var random = (0..maxInicial).random()
        txvMain.text = listaInicial[random]

        //Frases de motivação
        val listaDesmotivade = arrayListOf<String>(
            "A persistência é o caminho do êxito.",
            "Sonhe. Acredite. Realize. Repita.",
            "No meio da dificuldade encontra-se a oportunidade.",
            "Lute. Acredite. Conquiste. Perca. Deseje. Espere. Alcance. Invada. Caia. Seja tudo o quiser ser, mas acima de tudo, seja você sempre.",
            "Eu faço da dificuldade a minha motivação. A volta por cima vem na continuação.",
            "Acredite, você tem forças para chegar onde quiser. Basta querer.",
            "Comece fazendo o que é necessário, depois o que é possível, e de repente você estará fazendo o impossível.",
            "Se der medo, vai com medo mesmo.",
            "Uma chave importante para o sucesso é a auto-confiança. Uma chave importante para a auto-confiança é a preparação.",
            "Já experimentou acreditar em você? Tente! Você não faz ideia do que é capaz."
        )
        val maxDesmotivade = listaDesmotivade.size-1

        //Frases de autoestima
        val listaSemautoestima = arrayListOf<String>(
            "Acredite no seu valor e prove a você mesmo que todos os sonhos são possíveis de alcançar.",
            "Acredite em si mesmo em qualquer circunstância, pois você é o principal responsável pela sua felicidade.",
            "Quando você está satisfeito por ser simplesmente você mesmo e não se compara ou compete, todo mundo respeitará você.",
            "Adote um estilo e escolha o seu caminho. Seja você mesmo antes de tudo.",
            "Não seja tão duro com você mesmo. Todo mundo erra, mas os espertos sabem se perdoar, aprender e esquecer os próprios erros.",
            "Acreditar em nós mesmos é a maior prova de amor que podemos oferecer ao mundo.",
            "Você só vai conseguir amar outra pessoa quando aprender a amar a si mesmo.",
            "Entender que a beleza é plural é o primeiro passo para ter uma boa autoestima.",
            "Escolha ser gentil com você mesmo e ter amor próprio",
            "Na vida nunca se considere um perdedor, sempre se sinta um vencedor por estar vivo e por conquistar quem você ama."
        )
        val maxSemautoestima = listaSemautoestima.size-1

        //Frases de foco
        val listaSemfoco = arrayListOf<String>(
            "O que separa um sonho de um objetivo é o foco.",
            "Tudo que você precisa para começar a realizar seus sonhos é confiar em você e lutar sem ter medo de falhar.",
            "Vá firme na direção das suas metas, porque o pensamento cria, o desejo atrai e a fé realiza.",
            "Eu me foco em todas as coisas boas da vida e agradeço por elas.",
            "Faça menos, mas faça com foco.",
            "Seja seu foco. Faça as coisas por você.",
            "Se você quer vencer, não fique olhando a escada. Comece a subir, degrau por degrau, até chegar no topo.",
            "Não desista, alguém se inspira em você.",
            "Dizer que não tem tempo é perda de tempo e foco.",
            "Você precisa manter o foco em sua jornada para realizar grandes coisas."
        )
        val maxSemfoco = listaSemfoco.size-1

        //Frases engraçadas
        val listaPrabaixo = arrayListOf<String>(
            "Não deixes que nada te desanime, pois até um pé-na-bunda te empurra para a frente.",
            "O que o pato disse para a pata?\n" +
                    "R.: Vem Quá!",
            "A enfermeira diz ao médico: – Tem um homem invisível na sala de espera.\n" +
                    "O médico responde: – Diga a ele que não posso vê-lo agora.",
            "Era uma vez um pintinho que se chama Relam. Toda vez que chovia, relam piava!",
            "Minhas aulas online estão parecendo sessão espírita: toda hora o professor fica perguntando: \"Luiz, você está ai?\" , \"Telma, você me ouve?\", \"Tem alguém nessa sala?\".",
            "O que o tijolo falou para o outro?\n" +
                    "R.: Há um ciumento entre nós.",
            "Por que o policial não usa sabão?\n" +
                    "R.: Porque ele prefere deter gente.",
            "Qual a fruta que anda de trem?\n" +
                    "R.: O kiwiiiii.",
            "Qual é a galinha que cai no chão e surta?\n" +
                    "R.: A galinha cai-i-pira",
            "Vai ser complicado, mas se anime com as complicações. Não vai ser nada como você achou que seria, mas surpresas são boas para você.",
            "Já que é preciso aceitar a vida, que seja então corajosamente.",
            "Ao fim do dia, podemos aguentar muito mais do que pensamos que podemos."
        )
        val maxPrabaixo = listaPrabaixo.size-1

        //Frases felizes
        val listaFeliz = arrayListOf<String>(
            "O bom humor espalha mais felicidade que todas as riquezas do mundo. Vem do hábito de olhar para as coisas com esperança e de esperar o melhor e não o pior.\"",
            "Chique é ser feliz. Elegante é ser honesto. Bonito é ser caridoso. Sábio é saber ser grato. O resto é inversão de valores.",
            "Prefira o sorriso, faz bem a você e aos que estão ao seu redor. Dê risada de tudo, de si mesmo. Não adie alegrias. Seja feliz hoje!",
            "Tomara que a felicidade te pegue de jeito, e não te solte nunca mais... Vou achar bem feito porque você vai ganhar o que você merece: ser feliz!",
            "Que o vento leve, que a chuva lave, que a alma brilhe, que o coração acalme, que a harmonia se instale e a felicidade permaneça.",
            "Faça mais do que te faz feliz.",
            "Seja feliz. Não aceite menos que isso.",
            "Você nasceu para ser feliz, não para ser normal.",
            "Já que a felicidade incomoda tanto, vamos cuidar de ser ainda mais felizes e incomodar muito mais!",
            "Seja leve e agradeça o bom que te acontece",
            "Que a gente não perca essa ousadia de tentar ser feliz todos os dias.",
            "Que a felicidade seja sonho, meta e realidade",
            "Escolha ser feliz do seu jeito, não importa o que os outros digam."
        )
        val maxFeliz = listaFeliz.size-1

        //Frases de ansiedade
        val listaAnsiose = arrayListOf<String>(
            "O descanso é essencial para o bom funcionamento da nossa mente e corpo. O descanso dá energia para encarar o dia a dia.",
            "Aceite o passado, trate o seu presente com carinho e se fortaleça agora para que o futuro seja ainda melhor.",
            "Ao se preocupar com o que os outros vão pensar de nós, deixamos de agir naturalmente e podemos passar exatamente a impressão que não queremos. Seja você mesmo.",
            "Ninguém pode prever o futuro com exatidão. Uma coisa é se preparar para alguma situação futura, outra coisa é sofrer por conta disso.",
            "As coisas acontecem quando são para acontecer, do jeito que são para acontecer. Acredite na sua força interior e sinta-se bem com os resultados que alcançar.",
            "Pense sempre positivo e acalme o seu coração. Não fique tão preocupado, não fique tão ansioso. As coisas vão dar certo.",
            "Respire fundo, mantenha a calma e seja positivo. As coisas vão dar certo.",
            "Abraçar as pessoas que amamos ajuda a curar doenças como a ansiedade. Por isso, abrace muito todas as pessoas ao seu redor. Elas ficarão agradecidas e você, de bem com a vida.",
            "Relaxe. O que é seu está guardado e tentando encontrar o melhor caminho para chegar até você.",
            "Sente-se, conecte-se consigo mesmo e controle sua respiração.",
            "Espante a ansiedade de sua vida. Traga para o presente apenas os momentos de felicidade, apenas aquilo que te fará uma pessoa melhor."
        )
        val maxAnsiose = listaAnsiose.size-1

        btnMainDesmotivade.setOnClickListener {
            random = (0..maxDesmotivade).random()
            txvMain.text = listaDesmotivade[random]
        }

        btnMainSemautoestima.setOnClickListener {
            random = (0..maxSemautoestima).random()
            txvMain.text = listaSemautoestima[random]
        }

        btnMainSemfoco.setOnClickListener {
            random = (0..maxSemfoco).random()
            txvMain.text = listaSemfoco[random]
        }

        btnMainPrabaixo.setOnClickListener {
            random = (0..maxPrabaixo).random()
            txvMain.text = listaPrabaixo[random]
        }

        btnMainFeliz.setOnClickListener {
            random = (0..maxFeliz).random()
            txvMain.text = listaFeliz[random]
        }

        btnMainAnsiose.setOnClickListener {
            random = (0..maxAnsiose).random()
            txvMain.text = listaAnsiose[random]
        }

        //Botões inferiores
        var like = false
        var share = false
        var save = false
        imgMainLike.setOnClickListener {
            if(!like){
                imgMainLike.setImageResource(R.drawable.ic_baseline_favorite_24)
                like = true;
            }else{
                imgMainLike.setImageResource(R.drawable.ic_outline_favorite_border_24)
                like = false
            }
        }
        imgMainShare.setOnClickListener {
            if(!share){
                imgMainShare.setImageResource(R.drawable.ic_baseline_share_24)
                share = true;
            }else{
                imgMainShare.setImageResource(R.drawable.ic_outline_share_24)
                share = false
            }
        }
        imgMainSave.setOnClickListener {
            if(!save){
                imgMainSave.setImageResource(R.drawable.ic_baseline_bookmark_24)
                save = true;
            }else{
                imgMainSave.setImageResource(R.drawable.ic_outline_bookmark_border_24)
                save = false
            }
        }
    }
}