package com.example.projet_mobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
GET https://newsapi.org/v2/everything?q=keyword&apiKey=274d07e58064457594e0e4e637a81942


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        curl https://newsapi.org/v2/everything -G \
        -d q=Apple \
        -d from=2022-05-29 \
        -d sortBy=popularity \
        -d apiKey=274d07e58064457594e0e4e637a81942

        {
            "status": "ok",
            "totalResults": 188,
            -"articles": [
            -{
                -"source": {
                "id": null,
                "name": "The Guardian"
            },
                "author": "Rebecca Smithers",
                "title": "A hub for the village: how locals are buying up pubs at risk of closure",
                "description": "The rise of community pubs is slowing a long-term decline – and offering additional services like post offices and basic bankingA final lick of paint is drying on the donated, mismatched chairs and tables as the handful of volunteers gratefully sample the new…",
                "url": "https://amp.theguardian.com/lifeandstyle/2022/may/29/a-hub-for-the-village-how-locals-are-buying-up-pubs-at-risk-of-closure",
                "urlToImage": "https://i.guim.co.uk/img/media/7908a5ed9e786e8f82c6308c5b1d42baa666ad9c/0_338_5000_3000/master/5000.jpg?width=1200&height=630&quality=85&auto=format&fit=crop&overlay-align=bottom%2Cleft&overlay-width=100p&overlay-base64=L2ltZy9zdGF0aWMvb3ZlcmxheXMvdG8tZGVmYXVsdC5wbmc&enable=upscale&s=ad81e71f97bb33df1d702e1210b292b5",
                "publishedAt": "2022-05-29T08:00:02Z",
                "content": "A final lick of paint is drying on the donated, mismatched chairs and tables as the handful of volunteers gratefully sample the new chefs signature dish a chunky pork chop sandwich with apple relish.… [+5530 chars]"
            },
            -{
                -"source": {
                "id": null,
                "name": "9to5Mac"
            },
                "author": "Filipe Espósito",
                "title": "‘RealityOS’ trademark hints at Apple’s new AR/VR headset coming soon",
                "description": "Earlier this year, a few developers found references to a platform named “RealityOS” in App Store logs. This, of course, corroborated multiple rumors about Apple working on a new mixed reality headset. Now, thanks to a new “RealityOS” trademark, we may have a…",
                "url": "https://9to5mac.com/2022/05/29/realityos-trademark-related-to-apple-ar-vr-headset/",
                "urlToImage": "https://i0.wp.com/9to5mac.com/wp-content/uploads/sites/6/2022/05/Apple-AR-VR-headset-with-realityOS.png?resize=1200%2C628&quality=82&strip=all&ssl=1",
                "publishedAt": "2022-05-29T08:27:05Z",
                "content": "Earlier this year, a few developers found references to a platform named “RealityOS” in App Store logs. This, of course, corroborated multiple rumors about Apple working on a new mixed reality headse… [+3007 chars]"
            },
            -{
                -"source": {
                "id": null,
                "name": "Journal du geek"
            },
                "author": "Journal du Geek",
                "title": "Cet antivirus pour Mac vous protège contre les menaces (y compris la plus violente)",
                "description": "Pour naviguer en toute sécurité sur Internet, rien ne vaut un antivirus efficace. Si vous avez un ordinateur Apple, vous pouvez d'ailleurs profiter d'un bon plan qui permet d'acquérir à petit prix, le meilleur antivirus Mac du marché édité par la société fran…",
                "url": "https://www.journaldugeek.com/bon-plan/cet-antivirus-pour-mac-vous-protege-contre-les-menaces-y-compris-la-plus-violente/",
                "urlToImage": "https://www.journaldugeek.com/content/uploads/2022/05/antivirus-intego.jpg",
                "publishedAt": "2022-05-29T08:40:44Z",
                "content": "Pour naviguer en toute sécurité sur Internet, rien ne vaut un antivirus efficace. Si vous avez un ordinateur Apple, vous pouvez d'ailleurs profiter d'un bon plan qui permet d'acquérir à petit prix, l… [+4527 chars]"
            },
            -{
                -"source": {
                "id": null,
                "name": "Applesfera.com"
            },
                "author": "Pedro Aznar",
                "title": "El retorno de Apple",
                "description": "En realidad, Apple no se ha ido a ningún sitio. Quiero decir, no tiene que volver de ningún lado. La compañía lleva años cumpliendo objetivo tras objetivo, superando un punto de ruptura al que pocas compañías podrían haber sobrevivido: el fallecimiento de su …",
                "url": "https://www.applesfera.com/apple-1/retorno-apple",
                "urlToImage": "https://i.blogs.es/6d4795/813b9915-3e27-48cf-ba8c-a304de2e5a37/840_560.jpeg",
                "publishedAt": "2022-05-29T07:13:02Z",
                "content": "En realidad, Apple no se ha ido a ningún sitio. Quiero decir, no tiene que volver de ningún lado. La compañía lleva años cumpliendo objetivo tras objetivo, superando un punto de ruptura al que pocas … [+7775 chars]"
            },
            -{
                -"source": {
                "id": null,
                "name": "Applesfera.com"
            },
                "author": "Javier Lacort",
                "title": "AlDente, la aplicación que uso en macOS para preservar la duración de la batería del Mac",
                "description": "De las baterías de litio sabemos dos cosas: que un alto número de ciclos de carga y descarga erosiona su vida útil, y que permanecer durante el menor tiempo posible entre el 0-20% y el 80-100% de su capacidad ayuda a alargar su salud. Lo primero preocupa a qu…",
                "url": "https://www.applesfera.com/aplicaciones-os-x-1/aldente-aplicacion-que-uso-macos-para-preservar-duracion-bateria-mac",
                "urlToImage": "https://i.blogs.es/7cab17/d1/840_560.jpeg",
                "publishedAt": "2022-05-29T08:00:27Z",
                "content": "De las baterías de litio sabemos dos cosas: que un alto número de ciclos de carga y descarga erosiona su vida útil, y que permanecer durante el menor tiempo posible entre el 0-20% y el 80-100% de su … [+2814 chars]"
            },
            -{
                -"source": {
                "id": null,
                "name": "Xataka Android"
            },
                "author": "Álvaro García M.",
                "title": "El drama de encontrar un móvil Android compacto",
                "description": "Que las 6 pulgadas sean el estándar de los teléfonos móviles hoy en día, por locura que pareciese hace unos años, responde incluso a una evolución lógica. Eso de llevar un ordenador en el bolsillo ha ido cobrando cada vez más sentido hasta el punto de que muc…",
                "url": "https://www.xatakandroid.com/moviles-android/drama-encontrar-movil-android-compacto",
                "urlToImage": "https://i.blogs.es/56f3f2/drama-moviles-compactos/840_560.jpg",
                "publishedAt": "2022-05-29T09:00:28Z",
                "content": "Que las 6 pulgadas sean el estándar de los teléfonos móviles hoy en día, por locura que pareciese hace unos años, responde incluso a una evolución lógica. Eso de llevar un ordenador en el bolsillo ha… [+5900 chars]"
            },
            -{
                -"source": {
                "id": null,
                "name": "MacRumors"
            },
                "author": "Sami Fathi",
                "title": "'realityOS' Trademark Filing Hints at Possible WWDC Announcement",
                "description": "Ahead of WWDC kicking off in a little over one week, interesting trademark filing details for \"realityOS,\" the name for Apple's upcoming AR/VR headset operating system, have been resurfaced online, offering a clue as to what Apple may have in store to share a…",
                "url": "https://www.macrumors.com/2022/05/29/realityos-trademark-filing-ahead-of-wwdc/",
                "urlToImage": "https://images.macrumors.com/t/4UwUlVKHJsRp_-MI6X6Hshp9VSw=/1600x/article-new/2022/01/wwdc-2022-hero.jpg",
                "publishedAt": "2022-05-29T08:12:21Z",
                "content": "Ahead of WWDC kicking off in a little over one week, interesting trademark filing details for \"realityOS,\" the name for Apple's upcoming AR/VR headset operating system, have been resurfaced online, o… [+2066 chars]"
            },
            -{
                -"source": {
                "id": null,
                "name": "New York Times"
            },
                "author": "Tripp Mickle",
                "title": "Inside the Apple Store Battle for Union Representation",
                "description": "Weary from the pandemic and pressured by inflation, retail employees of the tech giant are holding votes on whether to unionize.",
                "url": "https://www.nytimes.com/2022/05/29/technology/apple-store-union.html",
                "urlToImage": "https://static01.nyt.com/images/2022/05/30/business/30appleunion/30appleunion-facebookJumbo.jpg",
                "publishedAt": "2022-05-29T09:00:12Z",
                "content": "Apple has hired Littler Mendelson, an employment law firm, to blunt the labor push. It also has furnished store managers with talking points, including that unionizing could result in fewer promotion… [+2045 chars]"
            },
            -{
                -"source": {
                "id": null,
                "name": "Srad.jp"
            },
                "author": "headless",
                "title": "DuckDuckGo、Microsoft へのトラッキング許可発覚を受けてアプリの説明を更新",
                "description": "DuckDuckGo のブラウザーアプリ DuckDuckGo Privacy Browser がサードパーティサイトで Microsoft の追跡を許可していると指摘されたことを受け、Apple の App Store と Google Play ストアでアプリの説明を更新している\n(BetaNews の記事、\nThe Register の記事、\nBleepingComputer の記事)。\n\nこの問題について DuckDuckGo CEO の Gabriel Weinberg 氏は、問題の機能 (サードパーテ…",
                "url": "https://it.srad.jp/story/22/05/29/0354226/",
                "urlToImage": "https://srad.jp/static/topics/privacy_64.png",
                "publishedAt": "2022-05-29T04:45:00Z",
                "content": "DuckDuckGo DuckDuckGo Privacy Browser Microsoft Apple App StoreGoogle Play \r\n(BetaNews The Register BleepingComputer )DuckDuckGo CEO Gabriel Weinberg (Tracker Radar) Bing DuckDuckGo Microsoft \r\ncooki… [+76 chars]"
            },
            -{
                -"source": {
                "id": null,
                "name": "The Indian Express"
            },
                "author": "Anuj Bhatia",
                "title": "Why I fell in love with Microsoft’s Surface Laptop Studio despite its shortcomings",
                "description": "I recently went back to the drawing board and started designing handbags in my free time, and I found the Laptop Studio changed the way I work.",
                "url": "https://indianexpress.com/article/technology/tech-reviews/microsoft-surface-laptop-studio-review-7941966/",
                "urlToImage": "https://images.indianexpress.com/2022/05/K1.jpg",
                "publishedAt": "2022-05-29T05:11:43Z",
                "content": "As I was waiting for someone at a Delhi hotel recently, I saw a gentleman coming my way. He sat next to me and curiously asked about the laptop I was using. Its a Surface Laptop Studio, I replied. Do… [+11299 chars]"
            },
            -{
                -"source": {
                "id": null,
                "name": "Nextpit.de"
            },
                "author": "Jade Bryan",
                "title": "Wahnwitziger Gucci-Fitness-Ring aus 18-Karat-Gold: Habt Ihr 950 € übrig?",
                "description": "Oura und Gucci haben sich zusammengetan, um einen luxuriösen, Smart-Ring auf den Markt zu bringen. Dabei kommt 18 karätiges Gold zum Einsatz.(Dies ist ein Teaser - klick hier, um den kompletten Beitrag zu lesen)",
                "url": "https://www.nextpit.de/wahnwitziger-gucci-fitness-ring-aus-18-karat-gold-habt-ihr-950-uebrig",
                "urlToImage": "https://fscl01.fonpit.de/userfiles/7734655/image/Gucci-x-Oura-Ring-generation-3-luxury-smart-tracker.jpg",
                "publishedAt": "2022-05-29T06:00:01Z",
                "content": "<ul><li>Der Oura Ring der 3. Generation erhält eine verrückte Gucci-Behandlung</li><li>Der Gucci x Oura Ring kommt mit 18 Karat Goldakzenten</li><li>Kostenpunkt 950 Euro (normales Modell: knapp 300 E… [+2303 chars]"
            },
            -{
                -"source": {
                "id": null,
                "name": "Techbang.com"
            },
                "author": "cnBeta",
                "title": "蘋果新專利：未來 MacBook Pro 完全取消螢幕邊框",
                "description": "蘋果新專利：未來 MacBook Pro 完全取消螢幕邊框據 Apple Insider 報導，蘋果正在研究完全地消除 14 英吋 MacBook Pro 和 16 英吋 MacBook Pro 上的邊框的技術和技巧。經過多年對 MacBook Pro 螢幕厚邊框的抱怨，蘋果推出了 14 英吋 MacBook Pro 和 16 英吋 MacBook Pro 來減少邊框。事實上，蘋果甚至將螢幕頂部向上推，這樣除了一個中央區域外，螢幕更高，頂部邊框比以往任何時候都更薄。\n然而，這引起了一些使用者的反感。那個中央區域被…",
                "url": "https://www.techbang.com/posts/96627-apples-new-patent-the-future-macbook-pro-screen-completely",
                "urlToImage": "https://cdn1.techbang.com/system/excerpt_images/96627/original/7d5e76e7852cf449260151a855c3f651.jpg?1653640224",
                "publishedAt": "2022-05-29T01:30:00Z",
                "content": "Apple Insider 14 MacBook Pro 16 MacBook Pro MacBook Pro 14 MacBook Pro 16 MacBook Pro \r\n iPhone \r\n (LED)\r\n (LPM) \r\nLED LPM MacBook Pro \r\n 2020 2013 Hopil Bae iPhone"
            },
            -{
                -"source": {
                "id": null,
                "name": "Techbang.com"
            },
                "author": "NetEase",
                "title": "高通當了兩年「火龍」怪三星、ARM還是台積電，這到底是誰的問題？",
                "description": "高通被人罵了兩年火龍，到底是誰的問題？\n這兩年Android的旗艦產品，發布會上的「最強性能」每年都能聽到，但功耗卻也飆的停不下來。很多人都想問：高通這兩年，到底為啥這麼熱？\n發熱問題不可避免，只要做功就一定會帶來發熱。而對晶片來說，這發熱則主要由動態功耗和靜態功耗兩部分構成。\n<ul>\n<li>\n動態功耗（ Dynamic Power ）主要指的是晶片在工作時產生的熱量，包括電路的充放電，電晶體工作狀態的跳變。</li>\n<li>\n靜態功耗（ Static Power ）主要是指晶片中各種類型的漏電流和競爭電流…",
                "url": "https://www.techbang.com/posts/96439-qualcomm-was-scolded-for-two-years-by-fire-dragon-whose-pot-is",
                "urlToImage": "https://cdn2.techbang.com/system/excerpt_images/96439/original/bec9d0009c405fdf914e56706050f39f.jpg?1653046538",
                "publishedAt": "2022-05-29T06:30:00Z",
                "content": "Android\r\n<ul><li> Dynamic Power </li><li> Static Power </li></ul>\r\n()\r\n28nm FinFET   \r\n5nm FinFET 28nm GAA   \r\nGAA 5nm FinFET\r\nSoC (SAMSUNG) 5nm FinFET \r\n 5nm 14 nm 5nm mm1713171.3 MTR \r\n5nm 126.5MTR… [+490 chars]"
            },
            -{
                -"source": {
                "id": null,
                "name": "Karapaia.com"
            },
                "author": "garretstyle",
                "title": "全店舗閉店してしまったので、自宅で作ろう「ソフトプレッツェル」【ネトメシ】",
                "description": "#authors_store {font-family: -apple-system,BlinkMacSystemFont,Roboto,\"游ゴシック体\",YuGothic,\"Yu Gothic Medium\",sans-serif;}#authors_store .article-header .article-title {font-size: 19px;line-height: 1.3;}#authors_store .content > header {position: relat...",
                "url": "https://karapaia.com/archives/52312901.html",
                "urlToImage": "https://livedoor.blogimg.jp/karapaia_zaeega/imgs/8/d/8d7764dd.jpg",
                "publishedAt": "2022-05-29T04:30:14Z",
                "content": "1013cm 8 50250g250g1260g3g300ml\r\n500g\r\n21\r\nM1\r\nOK\r\n2"
            },
            -{
                -"source": {
                "id": null,
                "name": "Hdblog.it"
            },
                "author": "HDblog.it",
                "title": "realityOS alla WWDC? I segnali che fanno pensare che il visore AR/VR sia in arrivo",
                "description": "8 giugno 2022: questa la data indicata da \"Realityo Systems LLC\" per la registrazione del marchio a livello internazionale. Coincidenze?",
                "url": "https://www.hdblog.it/indossabili/articoli/n556564/realityos-apple-marchio-visore-ar-vr-wwdc-2022/",
                "urlToImage": "https://hd2.tudocdn.net/1040693?w=1920",
                "publishedAt": "2022-05-29T09:15:00Z",
                "content": "L'imminente WWDC in programma dal 6 al 10 giugno prossimi potrebbe davvero essere l'occasione giusta per il debutto di realityOS, il sistema operativo di Apple per i visori AR/VR di cui tanto si parl… [+2170 chars]"
            },
            -{
                -"source": {
                "id": null,
                "name": "Actualidadiphone.com"
            },
                "author": "Ángel González",
                "title": "Apple publica por error un spot en el que aparece el posible iPhone 14 Pro",
                "description": "Apple ha publicado un anuncio de Apple Pay en Tailandia y lo ha borrado segundos después porque en él podrí verse el posible iPhone 14 Pro.",
                "url": "https://www.actualidadiphone.com/apple-publica-por-error-un-spot-en-el-que-aparece-el-posible-iphone-14-pro/",
                "urlToImage": "https://www.actualidadiphone.com/wp-content/uploads/2022/05/Apple-spot-iPhone-14-Pro.png",
                "publishedAt": "2022-05-29T08:00:03Z",
                "content": "Hace unos días se publicaban unos renders del iPhone 14 Pro que recogían todos los rumores en torno a su nuevo diseño. La realidad es que todas las filtraciones siguen una misma línea: los modelos es… [+2025 chars]"
            },
            -{
                -"source": {
                "id": null,
                "name": "L'Express"
            },
                "author": "AFP",
                "title": "Aux Etats-Unis, les bas salaires grimpent, les inégalités demeurent",
                "description": "Washington - Des employés de fast-food qui manifestent à Manhattan pour exiger un salaire de 20 dollars de l'heure: la revendication impensable avant la pandémie est désormais décomplexée, les entreprises multipliant des hausses spectaculaires qui n'ont toute…",
                "url": "https://www.lexpress.fr/actualites/1/actualite/aux-etats-unis-les-bas-salaires-grimpent-les-inegalites-demeurent_2174281.html",
                "urlToImage": "https://static.lexpress.fr/medias_12410/w_605,h_350,c_fill,g_north/v1653802212/des-employes-d-un-mcdonald-s-a-new-york-le-27-mai-2022-des-salaries-de-fast-food-ont-manifeste-a-manhattan-pour-demander-un-salaire-de-20-dollars-par-heure-une-revendication-impensable-avant-la-pandemie-mais-avec-la-penurie-de-main-d-oeuvre-aux-etats_6354130.jpg",
                "publishedAt": "2022-05-29T04:45:04Z",
                "content": "La pénurie de main d'oeuvre, liée aux contaminations par le Covid, aux problèmes de garde d'enfants et au ras-le-bol des employés sous-payés décidés à ne pas reprendre leur poste aux conditions d'ava… [+4176 chars]"
            },
            -{
                -"source": {
                "id": null,
                "name": "Tinhte.vn"
            },
                "author": "vn_ninja@yahoo.com (vn_ninja), vn_ninja",
                "title": "Bán điện thoại kèm quà như Samsung luôn thu hút người tiêu dùng, nhưng tại sao Apple lại không làm?",
                "description": "Một bài viết thú vị của tác giả Mark O’Neill trên Android Authority nói về việc bán điện thoại kèm quà của Samsung đã thu hút người dùng như thế nào? Mình thấy vấn đề này rất thực tế ở Việt Nam nên…",
                "url": "https://tinhte.vn/thread/ban-dien-thoai-kem-qua-nhu-samsung-luon-thu-hut-nguoi-tieu-dung-nhung-tai-sao-apple-lai-khong-lam.3523879/",
                "urlToImage": "https://photo2.tinhte.vn/data/attachment-files/2022/05/6003117_cover_S21_FE_5G_Kem_Qua_tinhte.jpg",
                "publishedAt": "2022-05-29T00:37:52Z",
                "content": "Các combo quà tng ca Samsung là mt trong nhng lý do ng sau doanh s rt tt ca công ty. Mi ngi u yêu thích nhng th min phí, c bit là nhng th gì ó thc t và hu dng nh mt cp tai nghe. Nhng th nh vy s bt u … [+2037 chars]"
            },
            -{
                -"source": {
                "id": null,
                "name": "Daily Beast"
            },
                "author": "The Daily Beast",
                "title": "George Carlin’s Daughter Says He’d ‘Roll Eyes’ at Far Right",
                "description": "Lisa Lake/Getty\r\nKelly Carlin, daughter of the late comedian George Carlin, is mystified that Donald Trump followers and right-wingers have tried to claim her dad as one of their own.“Before he died in 2008, and Hillary was running, my dad was like, ‘You know…",
                "url": "https://www.thedailybeast.com/george-carlins-daughter-says-hed-roll-eyes-at-far-right",
                "urlToImage": "https://img.thedailybeast.com/image/upload/c_crop,d_placeholder_euli9k,h_1688,w_3000,x_0,y_0/dpr_2.0/c_limit,w_740/fl_lossy,q_auto/v1653666656/220527-george-carlin-right-hero_xbisnf",
                "publishedAt": "2022-05-29T08:00:00Z",
                "content": "Kelly Carlin, daughter of the late comedian George Carlin, is mystified that Donald Trump followers and right-wingers have tried to claim her dad as one of their own.\r\nBefore he died in 2008, and Hil… [+2336 chars]"
            },
            -{
                -"source": {
                "id": null,
                "name": "Macitynet.it"
            },
                "author": "Mauro Notarianni",
                "title": "Touch Bar: Apple l’ha abbandonata, ma i produttori di PC ci credono ancora",
                "description": "Sui notebook recenti, Apple non offre più la Touch Bar, ma produttori quali Dell e Corsair credono ancora nalla validità del display con le scorciatoie.\n- su macitynet.it Touch Bar: Apple l’ha abbandonata, ma i produttori di PC ci credono ancora",
                "url": "https://www.macitynet.it/notebook-pc-con-la-touch-bar/",
                "urlToImage": "https://www.macitynet.it/wp-content/uploads/2017/01/touchbar-bug-2.jpg",
                "publishedAt": "2022-05-29T06:44:11Z",
                "content": "Sui notebook recenti, Apple non offre più la Touch Bar, il mini display Retina integrato nella parte superiore della tastiera offerto sui MacBook Pro a partire dal 2016 e che metteva a disposizione a… [+1821 chars]"
            }
            ]
        }
    }
}