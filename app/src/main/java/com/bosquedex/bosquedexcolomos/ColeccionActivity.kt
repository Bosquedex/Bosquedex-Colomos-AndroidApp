package com.bosquedex.bosquedexcolomos

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class ColeccionActivity : AppCompatActivity() {

    private lateinit var imageButton1: ImageView
    private lateinit var imageButton2: ImageView
    private lateinit var imageButton3: ImageView
    private lateinit var imageButton4: ImageView
    private lateinit var imageButton5: ImageView
    private lateinit var imageButton6: ImageView
    private lateinit var imageButton7: ImageView
    private lateinit var imageButton8: ImageView
    private lateinit var imageButton9: ImageView
    private lateinit var imageButton10: ImageView
    private lateinit var imageButton11: ImageView
    private lateinit var imageButton12: ImageView
    private lateinit var imageButton13: ImageView
    private lateinit var imageButton14: ImageView
    private lateinit var imageButton15: ImageView
    private lateinit var imageButton16: ImageView
    private lateinit var imageButton17: ImageView
    private lateinit var imageButton18: ImageView
    private lateinit var imageButton19: ImageView
    private lateinit var imageButton20: ImageView
    private lateinit var imageButton21: ImageView
    private lateinit var imageButton22: ImageView
    private lateinit var imageButton23: ImageView
    private lateinit var imageButton24: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coleccion)
        val info1 = Intent(this, Pop::class.java)

        // Initialize button views
        imageButton1 = findViewById(R.id.imageButton1)
        imageButton2 = findViewById(R.id.imageButton2)
        imageButton3 = findViewById(R.id.imageButton3)
        imageButton4 = findViewById(R.id.imageButton4)
        imageButton5 = findViewById(R.id.imageButton5)
        imageButton6 = findViewById(R.id.imageButton6)
        imageButton7 = findViewById(R.id.imageButton7)
        imageButton8 = findViewById(R.id.imageButton8)
        imageButton9 = findViewById(R.id.imageButton9)
        imageButton10 = findViewById(R.id.imageButton10)
        imageButton11 = findViewById(R.id.imageButton11)
        imageButton12 = findViewById(R.id.imageButton12)
        imageButton13 = findViewById(R.id.imageButton13)
        imageButton14 = findViewById(R.id.imageButton14)
        imageButton15 = findViewById(R.id.imageButton15)
        imageButton16 = findViewById(R.id.imageButton16)
        imageButton17 = findViewById(R.id.imageButton17)
        imageButton18 = findViewById(R.id.imageButton18)
        imageButton19 = findViewById(R.id.imageButton19)
        imageButton20 = findViewById(R.id.imageButton20)
        imageButton21 = findViewById(R.id.imageButton21)
        imageButton22 = findViewById(R.id.imageButton22)
        imageButton23 = findViewById(R.id.imageButton23)
        imageButton24 = findViewById(R.id.imageButton24)

        imageButton1.setOnClickListener {
            info1.putExtra("nombre","Abaniquillo Pañuelo del Pacífico/Anolis nebulosus")
            info1.putExtra("descripcion","Lagarto de aprox 32-55mm, grisaceo marron, con un apendice similar a un abanico verde, del cual se desconoce su esperanza de vida exacta")
            info1.putExtra("habitat","Endemico de la costa del pacifico de Mexico")
            info1.putExtra("dieta","Se alimenta de insectos, otros artropodos o incluso su propia piel desprendida")
            info1.putExtra("comportamiento","Diurnos arboreos, suelen ser agresivos para defender su territorio")
            info1.putExtra("reproduccion","Oviparos, ponen huevos en epocas de lluvias")
            info1.putExtra("conservacion","En Preocupacion Menor")
            info1.putExtra("curiosidad","Pueden desprender su cola para escapar de los depredadores, y luego les crece una nueva")
            startActivity(info1)
        }

        imageButton2.setOnClickListener {
            info1.putExtra("nombre", "Alicante de Centro/Pituophis deppei")
            info1.putExtra("descripcion", "Serpiente de tamaño grande, puede medir hasta 2 metros de longitud. Su coloración varía desde el marrón claro hasta el amarillo con patrones oscuros.Su esperanza de vida en cautiverio es de aproximadamente 15-20 años.")
            info1.putExtra("habitat", "Endémico de México, encontrado en zonas áridas y semiáridas, bosques de pino-encino y matorrales.")
            info1.putExtra("dieta", "Se alimenta principalmente de roedores, aves y otros pequeños vertebrados.")
            info1.putExtra("comportamiento", "Diurna y terrestre, conocida por su comportamiento defensivo, emitiendo sonidos fuertes cuando se siente amenazada.")
            info1.putExtra("reproduccion", "Ovípara, las hembras ponen entre 3 y 24 huevos por temporada.")
            info1.putExtra("conservacion", "No está actualmente en peligro significativo, clasificada como de 'Preocupación Menor'.")
            info1.putExtra("curiosidad", "Produce un sonido similar al de un silbido o gruñido al inflar su garganta cuando se siente amenazada.")
            startActivity(info1)
        }

        imageButton3.setOnClickListener {
            info1.putExtra("nombre", "Ardilla Roca/Otospermophilus variegatus")
            info1.putExtra("descripcion", "Ardilla terrestre de tamaño mediano, con una longitud de cuerpo de 22-30 cm y una cola de 19-25 cm. Su pelaje es grisáceo con patrones moteados y su esperanza de vida es de aproximadamente 6-10 años.")
            info1.putExtra("habitat", "Se encuentra en una variedad de hábitats, incluyendo bosques, áreas rocosas y zonas urbanas, desde el suroeste de Estados Unidos hasta México.")
            info1.putExtra("dieta", "Omnívora, se alimenta de semillas, frutas, insectos y pequeños vertebrados.")
            info1.putExtra("comportamiento", "Diurna y social, vive en colonias. Excava madrigueras y almacena alimentos para el invierno.")
            info1.putExtra("reproduccion", "Ovípara, las hembras tienen una camada de 5-7 crías después de un período de gestación de aproximadamente un mes.")
            info1.putExtra("conservacion", "No se considera en peligro, clasificada como de 'Preocupación Menor'.")
            info1.putExtra("curiosidad", "Es conocida por sus comportamientos de almacenamiento de comida, enterrando semillas y frutos para consumir más tarde.")
            startActivity(info1)
        }

        imageButton4.setOnClickListener {
            info1.putExtra("nombre", "Serpiente Bejuquilla/Oxybelis fulgidus")
            info1.putExtra("descripcion", "Serpiente delgada de 1.5-2 m de longitud, verde brillante con parte inferior amarillo-verdosa, ojos dorados, y esperanza de vida de 9-15 años")
            info1.putExtra("habitat", "Bosques tropicales de América Central y del Sur")
            info1.putExtra("dieta", "Carnívora, se alimenta de ranas, lagartos, y aves pequeñas")
            info1.putExtra("comportamiento", "Arbórea y diurna, utiliza su camuflaje y cola prensil para cazar")
            info1.putExtra("reproduccion", "Ovípara, pone de 6 a 10 huevos que incuban por aproximadamente 100 días")
            info1.putExtra("conservacion", "No está en peligro de extinción")
            info1.putExtra("curiosidad", "Sus ojos tienen visión binocular, lo cual es raro en serpientes")
            startActivity(info1)
        }

        imageButton5.setOnClickListener {
            info1.putExtra("nombre","Carpa China/Cyprinus rubrofuscus")
            info1.putExtra("descripcion","Pez de cuerpo alargado con patrones multicolores, mide de 30-60 cm, y puede llegar a vivir entre 25 y 35 años en cautiverio.")
            info1.putExtra("habitat","Originario del este de Asia, se encuentra en China, Corea, Rusia, Vietnam y Laos.")
            info1.putExtra("dieta","Omnívoro, se alimenta de pellets, vegetales frescos como lechuga y espinaca, y ocasionalmente de gusanos y camarones.")
            info1.putExtra("comportamiento","Suelen habitar estanques y ríos de movimiento lento, conocidos por su comportamiento pacífico.")
            info1.putExtra("reproduccion","Ovíparos, con machos desarrollando tubérculos blancos en la temporada de desove.")
            info1.putExtra("conservacion","En Preocupación Menor según la IUCN.")
            info1.putExtra("curiosidad","Es la especie de la que se derivan los conocidos peces Koi, populares en estanques ornamentales.")
            startActivity(info1)
        }

        imageButton6.setOnClickListener {
            info1.putExtra("nombre","Carpa Común/Cyprinus carpio")
            info1.putExtra("descripcion","Pez de cuerpo robusto y alargado, de unos 35 a 120 cm de longitud. Pueden vivir entre 20 y 30 años.")
            info1.putExtra("habitat","Distribuidos en aguas dulces y salobres de Europa, Asia y América del Norte. Prefieren lagos y ríos con corrientes lentas.")
            info1.putExtra("dieta","Omnívoros, se alimentan de plantas acuáticas, insectos, crustáceos y detritos.")
            info1.putExtra("comportamiento","Generalmente bentónicos, prefieren aguas con fondos fangosos donde buscan alimento.")
            info1.putExtra("reproduccion","Ovíparos, desovan varias veces al año en aguas poco profundas con vegetación densa.")
            info1.putExtra("conservacion","Clasificados como de menor preocupación, pero pueden ser invasivos fuera de su área nativa.")
            info1.putExtra("curiosidad","Las carpas koi, una variedad ornamental, son muy valoradas en la acuicultura y pueden alcanzar precios elevados.")
            startActivity(info1)
        }

        imageButton7.setOnClickListener {
            info1.putExtra("nombre","Carpintero Cheje/Melanerpes aurifrons")
            info1.putExtra("descripcion","Pájaro de tamaño mediano (20-24 cm) con plumaje grisáceo y barrado en la espalda, frente amarilla y una corona roja en los machos. Su esperanza de vida es de unos 4-5 años en la naturaleza.")
            info1.putExtra("habitat","Se encuentra en bosques, áreas ribereñas, pastizales y zonas suburbanas desde el sur de los Estados Unidos hasta Nicaragua.")
            info1.putExtra("dieta","Omnívoro, se alimenta de insectos, frutas, nueces y ocasionalmente savia de árboles.")
            info1.putExtra("comportamiento","Diurno, territorial y social. No es migratorio.")
            info1.putExtra("reproduccion","Monógamos, construyen nidos en cavidades de árboles. Ponen entre 3-6 huevos por nidada.")
            info1.putExtra("conservacion","En Preocupación Menor")
            info1.putExtra("curiosidad","A menudo almacenan alimentos en agujeros de árboles o postes de cercas para consumo posterior.")
            startActivity(info1)
        }

        imageButton8.setOnClickListener {
            info1.putExtra("nombre", "Colibrí Verde/Colibri thalassinus")
            info1.putExtra("descripcion", "Ave de aproximadamente 11-12 cm, verde brillante con un parche violeta en las orejas. Esperanza de vida de 3-5 años en la naturaleza.")
            info1.putExtra("habitat", "Se encuentra en las tierras altas desde México hasta Nicaragua, prefiere bosques subtropicales y zonas templadas bajas.")
            info1.putExtra("dieta", "Se alimenta de néctar y pequeños insectos.")
            info1.putExtra("comportamiento", "Solitaria, defensora de su territorio de alimentación. Parcialmente migratoria.")
            info1.putExtra("reproduccion", "Nidifica en ramas bajas; la hembra construye el nido y pone dos huevos blancos. El periodo de incubación es de 14-18 días.")
            info1.putExtra("conservacion", "En Preocupación Menor.")
            info1.putExtra("curiosidad", "Canta un vigoroso CHEEP-chut-chut repetidamente a lo largo del día.")
            startActivity(info1)
        }

        imageButton9.setOnClickListener {
            info1.putExtra("nombre", "Conejo Serrano/Sylvilagus floridanus")
            info1.putExtra("descripcion", "Conejo de tamaño mediano, con pelaje pardo o grisáceo. Su esperanza de vida es de aproximadamente 1-3 años en la naturaleza.")
            info1.putExtra("habitat", "Se encuentra en una variedad de hábitats, incluyendo bosques, matorrales, praderas y áreas suburbanas en el sureste de Estados Unidos.")
            info1.putExtra("dieta", "Herbívoro, se alimenta principalmente de hierbas, pastos, hojas y corteza.")
            info1.putExtra("comportamiento", "Preferentemente crepuscular y nocturno, vive en madrigueras que excava en el suelo.")
            info1.putExtra("reproduccion", "Ovíparo, las hembras construyen nidos en madrigueras y pueden tener varias camadas por año.")
            info1.putExtra("conservacion", "No se considera en peligro, aunque enfrenta amenazas como la pérdida de hábitat y la caza.")
            info1.putExtra("curiosidad", "Es conocido por su capacidad de reproducirse rápidamente en condiciones favorables, lo que le permite adaptarse a entornos cambiantes.")
            startActivity(info1)
        }


        //De aqui en adelante la info puede estar mal, no muy bien actualizada y podria ser actualizada
        imageButton10.setOnClickListener {
            info1.putExtra("nombre", "Ardea alba")
            info1.putExtra("descripcion", "La Garza Blanca es un ave grande, de plumaje completamente blanco y pico largo y amarillo. Puede alcanzar hasta 1 metro de altura y pesar entre 1.3 a 2.0 kg. Tienen una esperanza de vida de aproximadamente 15 a 20 años en la naturaleza.")
            info1.putExtra("habitat", "Habita en una amplia variedad de hábitats acuáticos, incluyendo lagos, estanques, ríos, manglares y costas marinas.")
            info1.putExtra("dieta", "Se alimenta principalmente de peces, pero también consume anfibios, reptiles, pequeños mamíferos, insectos y crustáceos.")
            info1.putExtra("comportamiento", "Es una especie solitaria y territorial durante la temporada de cría, pero puede formar colonias en épocas de reproducción. Es activa principalmente durante el amanecer y el atardecer.")
            info1.putExtra("reproduccion", "Son monógamos durante la temporada de cría. Construyen nidos grandes y dispersos en árboles o en áreas con vegetación densa cerca del agua. Ponen de 3 a 5 huevos blancos que ambos padres incuban.")
            info1.putExtra("conservacion", "Clasificada como de Preocupación Menor por la UICN debido a su amplia distribución y población estable. Sin embargo, enfrenta amenazas como la pérdida de hábitat y la contaminación.")
            info1.putExtra("curiosidad", "Las garzas blancas adultas pueden volar a altitudes considerablemente altas durante la migración. Son conocidas por su vuelo majestuoso y su habilidad para detectar presas bajo el agua.")
            startActivity(info1)
        }

        imageButton11.setOnClickListener {
            info1.putExtra("nombre", "Iguana Verde/Iguana iguana")
            info1.putExtra("descripcion", "La Iguana Verde es un lagarto grande y robusto, con un cuerpo escamoso de color verde brillante. Puede alcanzar longitudes de hasta 2 metros desde la cabeza hasta la cola y pesar hasta 4.5 kg. En cautiverio pueden vivir alrededor de 20 años.")
            info1.putExtra("habitat", "Se encuentra en bosques tropicales, selvas húmedas y zonas costeras. Prefiere áreas con acceso a cuerpos de agua como ríos o lagos.")
            info1.putExtra("dieta", "Es principalmente herbívora, alimentándose de hojas, frutas, flores y brotes tiernos. Ocasionalmente consume insectos y pequeños vertebrados.")
            info1.putExtra("comportamiento", "Es arbórea y terrestre, pasando tiempo tanto en árboles como en el suelo. Es diurna y más activa durante las horas más cálidas del día.")
            info1.putExtra("reproduccion", "Las iguanas verdes alcanzan la madurez sexual entre los 2 y 3 años de edad. Son ovíparas y ponen entre 20 a 70 huevos en nidos excavados en tierra, que eclosionan después de unos 10-15 semanas.")
            info1.putExtra("conservacion", "Clasificada como de Preocupación Menor por la UICN debido a su amplia distribución y adaptabilidad a diferentes hábitats. Sin embargo, enfrenta amenazas como la pérdida de hábitat y la caza para el comercio de mascotas y consumo humano.")
            info1.putExtra("curiosidad", "Las iguanas verdes son capaces de caer desde alturas significativas sin sufrir lesiones graves gracias a su cola larga y robusta, que actúa como un paracaídas natural.")
            startActivity(info1)
        }

        imageButton12.setOnClickListener {
            info1.putExtra("nombre", "Lagarto de King Arizona/Elgaria kingii")
            info1.putExtra("descripcion", "Lagarto de tamaño mediano con cuerpo alargado y patas cortas. Su coloración varía desde grisáceo hasta marrón oscuro, con patrones de manchas o bandas claras a lo largo del cuerpo. Pueden vivir hasta 15 años en la naturaleza.")
            info1.putExtra("habitat", "Se encuentra en áreas semiáridas y boscosas, preferentemente cerca de arroyos y áreas con vegetación densa. Son comunes en las regiones montañosas del oeste de Estados Unidos y norte de México.")
            info1.putExtra("dieta", "Es carnívoro, alimentándose principalmente de insectos, arañas, pequeños vertebrados y ocasionalmente plantas.")
            info1.putExtra("comportamiento", "Es diurno y terrestre, aunque puede trepar árboles y rocas. Prefiere áreas con refugios como troncos caídos o rocas.")
            info1.putExtra("reproduccion", "Son ovovivíparos, lo que significa que los huevos se desarrollan dentro del cuerpo de la hembra y nacen jóvenes completamente formados. Las crías nacen en primavera y son independientes desde el nacimiento.")
            info1.putExtra("conservacion", "No se considera en peligro de extinción. Sin embargo, algunas poblaciones locales pueden verse afectadas por la pérdida de hábitat debido al desarrollo humano.")
            info1.putExtra("curiosidad", "El nombre común 'Lagarto de King' proviene del naturalista estadounidense Clarence King, quien exploró extensamente el oeste de Estados Unidos.")
            startActivity(info1)
        }

        imageButton13.setOnClickListener {
            info1.putExtra("nombre", "Murcielago Frutero/Artibeus jamaicensis")
            info1.putExtra("descripcion", "El Murciélago Frugívoro Jamaicano es una especie de murciélago de tamaño mediano, con pelaje corto y suave de color marrón oscuro a negro. Puede alcanzar una longitud de hasta 8 cm y pesar entre 45-90 gramos. En la naturaleza, pueden vivir alrededor de 10-12 años.")
            info1.putExtra("habitat", "Se encuentra en una amplia variedad de hábitats desde bosques tropicales hasta zonas urbanas. Prefiere áreas con acceso a fuentes de agua y árboles frutales.")
            info1.putExtra("dieta", "Es frugívoro, alimentándose principalmente de frutas maduras. También consume néctar y ocasionalmente insectos.")
            info1.putExtra("comportamiento", "Es nocturno y arbóreo, pasando la mayor parte del tiempo en los árboles. Forman colonias grandes que pueden consistir en cientos de individuos.")
            info1.putExtra("reproduccion", "Son polígamos y las hembras pueden tener crías una o dos veces al año. Las crías nacen en primavera después de una gestación de unos 4-5 meses.")
            info1.putExtra("conservacion", "Clasificado como de Preocupación Menor por la UICN debido a su amplia distribución y tolerancia a diferentes hábitats. Sin embargo, la pérdida de hábitat y la caza para consumo humano representan amenazas significativas en algunas áreas.")
            info1.putExtra("curiosidad", "Artibeus jamaicensis es importante para la dispersión de semillas en los ecosistemas tropicales debido a su dieta frugívora. Ayudan a mantener la diversidad vegetal al transportar semillas a diferentes áreas.")
            startActivity(info1)
        }

        imageButton14.setOnClickListener {
            info1.putExtra("nombre", "Paloma Domestica/Columba livia")
            info1.putExtra("descripcion", "La Paloma Doméstica es una especie de ave de tamaño mediano, con plumaje que varía ampliamente en coloración, incluyendo tonos de gris, blanco, negro y marrón. Pueden alcanzar una longitud de hasta 33 cm y pesar entre 238-380 gramos. En la naturaleza, pueden vivir hasta 15 años.")
            info1.putExtra("habitat", "Se encuentra en una amplia variedad de hábitats urbanos y rurales. Prefiere áreas con estructuras elevadas para anidar, como edificios y acantilados.")
            info1.putExtra("dieta", "Es granívora y herbívora, alimentándose principalmente de semillas, granos, frutas y vegetación. También pueden consumir ocasionalmente insectos y pequeños invertebrados.")
            info1.putExtra("comportamiento", "Es sedentaria y diurna, siendo activa principalmente durante el día. Forman grandes colonias y son conocidas por su habilidad para regresar a su lugar de origen después de ser liberadas a largas distancias.")
            info1.putExtra("reproduccion", "Son monógamas durante la temporada de cría y pueden tener varias crías al año. Construyen nidos simples hechos de palitos y ramas.")
            info1.putExtra("conservacion", "Debido a su estrecha asociación con los humanos, la Paloma Doméstica no se considera en peligro de extinción. Sin embargo, las poblaciones urbanas pueden enfrentar problemas como la falta de hábitat adecuado y control de población.")
            info1.putExtra("curiosidad", "Columba livia tiene una larga historia de domesticación y uso por parte de los humanos. Se cree que desciende de la Paloma Bravia, y ha sido utilizada para mensajería y como símbolo de paz en diversas culturas.")
            startActivity(info1)
        }

        imageButton15.setOnClickListener {
            info1.putExtra("nombre", "Pato Real/Cairina moschata")
            info1.putExtra("descripcion", "El Pato Real es una especie de ave de tamaño grande y robusto, con plumaje variable que puede ser negro, blanco o una combinación de ambos. Los machos pueden alcanzar una longitud de hasta 86 cm y un peso de 4-6 kg. En la naturaleza, pueden vivir entre 8 y 12 años.")
            info1.putExtra("habitat", "Se encuentra en una amplia variedad de hábitats acuáticos, incluyendo ríos, lagos, estanques y manglares. Prefiere áreas con vegetación densa para anidar y descansar.")
            info1.putExtra("dieta", "Es omnívoro, alimentándose de una variedad de alimentos que incluyen plantas acuáticas, insectos, peces, crustáceos y pequeños vertebrados.")
            info1.putExtra("comportamiento", "Es una especie sedentaria y diurna, aunque puede ser activa durante la noche en áreas poco perturbadas. Se mueve principalmente en tierra y es capaz de volar, pero prefiere caminar o nadar.")
            info1.putExtra("reproduccion", "Los Patos Real forman parejas monógamas durante la temporada de cría. Construyen nidos en cavidades o en lugares elevados y las hembras ponen de 8 a 16 huevos. Ambos padres cuidan y protegen a los polluelos hasta que son independientes.")
            info1.putExtra("conservacion", "No se considera en peligro de extinción. Sin embargo, las poblaciones locales pueden enfrentar presiones debido a la caza, la pérdida de hábitat y la competencia con especies introducidas.")
            info1.putExtra("curiosidad", "El Pato Real es conocido por su carácter tranquilo y su capacidad para domesticarse fácilmente. Se cría en muchas partes del mundo por su carne y como ave ornamental en parques y estanques.")
            startActivity(info1)
        }

        imageButton16.setOnClickListener {
            info1.putExtra("nombre", "Plectrohyla cyanomma")
            info1.putExtra("descripcion", "La Rana Fisgona Deslumbrante es una especie de rana de tamaño mediano con colores llamativos. Su piel es predominantemente de color verde o azul con patrones de manchas o rayas. Puede alcanzar una longitud de hasta 8 cm.")
            info1.putExtra("habitat", "Es endémica de México, específicamente se encuentra en bosques nublados y montañas de las regiones de Veracruz y Oaxaca.")
            info1.putExtra("dieta", "Es insectívora, alimentándose principalmente de pequeños insectos y otros invertebrados que encuentra en el suelo del bosque.")
            info1.putExtra("comportamiento", "Es nocturna y arbórea, pasando la mayor parte de su tiempo en la vegetación densa y cerca de cursos de agua. Su nombre 'Fisgona' se debe a su habilidad para detectar presas rápidamente.")
            info1.putExtra("reproduccion", "Son ovíparas y depositan sus huevos en hojas sobre charcos temporales en el bosque. Las crías emergen como renacuajos y completan su desarrollo en el agua.")
            info1.putExtra("conservacion", "Se considera Vulnerable según la Lista Roja de la UICN debido a la pérdida de hábitat por deforestación y cambio climático. Además, enfrenta amenazas por la contaminación de los cursos de agua donde se reproduce.")
            info1.putExtra("curiosidad", "La Rana Fisgona Deslumbrante es conocida por su llamativo color azul y verde, que la hace destacar en el bosque nublado. Es un indicador importante de la salud de los ecosistemas donde habita.")
            startActivity(info1)
        }

        imageButton17.setOnClickListener {
            info1.putExtra("nombre", "Craugastor augusti")
            info1.putExtra("descripcion", "La Rana Ladradora Costeña es una especie de rana de tamaño mediano con piel rugosa y coloración variable, generalmente en tonos de marrón o gris. Puede alcanzar una longitud de hasta 7 cm.")
            info1.putExtra("habitat", "Es endémica de México, específicamente se encuentra en bosques tropicales y subtropicales de las regiones costeras del país, desde Sinaloa hasta Oaxaca.")
            info1.putExtra("dieta", "Es carnívora, alimentándose principalmente de insectos y otros invertebrados que captura activamente en el suelo del bosque durante la noche.")
            info1.putExtra("comportamiento", "Es nocturna y terrestre, encontrándose comúnmente bajo hojarasca y troncos caídos. Es conocida por su llamado nocturno, que suena similar al ladrido de un perro, de ahí su nombre común.")
            info1.putExtra("reproduccion", "Son ovíparas y depositan sus huevos en nidos terrestres. Las crías emergen como renacuajos y completan su desarrollo en cuerpos de agua cercanos, como charcos temporales y arroyos.")
            info1.putExtra("conservacion", "Se considera Vulnerable según la Lista Roja de la UICN debido a la pérdida y fragmentación de su hábitat por la deforestación y el desarrollo urbano en las zonas costeras de México.")
            info1.putExtra("curiosidad", "La Rana Ladradora Costeña debe su nombre a su distintivo llamado nocturno, que puede escucharse durante las noches cálidas y húmedas en los bosques tropicales costeros de México.")
            startActivity(info1)
        }

        imageButton18.setOnClickListener {
            info1.putExtra("nombre", "Rana Leopardo Neovolcanica/Lithobates neovolcanicus")
            info1.putExtra("descripcion", "La Rana Leopardo Neovolcánica es una especie de rana de tamaño mediano con un patrón distintivo de manchas o rayas oscuras sobre un fondo de color claro o amarillo. Puede alcanzar una longitud de hasta 8 cm.")
            info1.putExtra("habitat", "Es endémica de México, específicamente se encuentra en áreas cercanas a volcanes activos o extintos en los estados de Michoacán y México.")
            info1.putExtra("dieta", "Es carnívora, alimentándose principalmente de insectos, pequeños invertebrados y ocasionalmente pequeños vertebrados que captura activamente cerca de cuerpos de agua y en el suelo del bosque.")
            info1.putExtra("comportamiento", "Es nocturna y terrestre, pasando la mayor parte de su tiempo cerca de cuerpos de agua como lagunas y arroyos en áreas montañosas y boscosas.")
            info1.putExtra("reproduccion", "Son ovíparas y depositan sus huevos en el agua, donde las larvas eclosionan y se desarrollan como renacuajos antes de transformarse en ranas juveniles.")
            info1.putExtra("conservacion", "Se considera Vulnerable según la Lista Roja de la UICN debido a la pérdida y fragmentación de su hábitat por la deforestación y la actividad humana en las zonas montañosas de México.")
            info1.putExtra("curiosidad", "La Rana Leopardo Neovolcánica debe su nombre a su patrón de manchas oscuras que asemejan el pelaje de un leopardo. Es un indicador importante de la salud de los ecosistemas montañosos donde habita.")
            startActivity(info1)
        }

        imageButton19.setOnClickListener {
            info1.putExtra("nombre", "Rana Leopardo Noroeste/Lithobates magnaocularis")
            info1.putExtra("descripcion", "La Rana Leopardo Noroeste es una especie de rana de tamaño mediano con un patrón distintivo de manchas o rayas oscuras sobre un fondo de color claro o amarillo. Puede alcanzar una longitud de hasta 9 cm.")
            info1.putExtra("habitat", "Es endémica del noroeste de México, específicamente se encuentra en bosques templados y subtropicales cerca de cuerpos de agua como arroyos y lagunas.")
            info1.putExtra("dieta", "Es carnívora, alimentándose principalmente de insectos, pequeños invertebrados y ocasionalmente pequeños vertebrados que captura activamente cerca de cuerpos de agua y en el suelo del bosque.")
            info1.putExtra("comportamiento", "Es nocturna y terrestre, prefiriendo áreas con vegetación densa y sombreada cerca de agua. Durante la época de reproducción, los machos emiten llamados para atraer a las hembras.")
            info1.putExtra("reproduccion", "Son ovíparas y depositan sus huevos en el agua, donde las larvas eclosionan y se desarrollan como renacuajos antes de transformarse en ranas juveniles.")
            info1.putExtra("conservacion", "Se considera Vulnerable según la Lista Roja de la UICN debido a la pérdida y fragmentación de su hábitat por la deforestación y el desarrollo humano en las regiones montañosas del noroeste de México.")
            info1.putExtra("curiosidad", "La Rana Leopardo Noroeste es conocida por su patrón de manchas oscuras que asemejan el pelaje de un leopardo, lo cual le proporciona camuflaje en su hábitat natural. Es un indicador importante de la salud de los ecosistemas acuáticos donde habita.")
            startActivity(info1)
        }

        imageButton20.setOnClickListener {
            info1.putExtra("nombre", "Rana Toro/Lithobates catesbeianus")
            info1.putExtra("descripcion", "La Rana Toro es una especie de rana de tamaño grande y robusta, con piel lisa y coloración variable que puede ser verde oliva, marrón o grisácea. Puede alcanzar una longitud de hasta 15-20 cm.")
            info1.putExtra("habitat", "Es nativa del este de América del Norte, pero se ha introducido en muchas partes del mundo. Prefiere hábitats con agua estancada o de flujo lento, como estanques, lagos y zonas pantanosas.")
            info1.putExtra("dieta", "Es carnívora y voraz, alimentándose de una amplia variedad de presas que incluyen insectos, peces pequeños, anfibios, reptiles, aves y mamíferos pequeños.")
            info1.putExtra("comportamiento", "Es principalmente acuática y nocturna, pasando la mayor parte de su tiempo en el agua o cerca de ella. Tiene una habilidad excepcional para saltar y nadar, lo que la convierte en una depredadora eficiente.")
            info1.putExtra("reproduccion", "Es ovípara y las hembras pueden poner hasta 20,000 huevos en una sola puesta. Las larvas emergen como renacuajos y completan su metamorfosis en ranas juveniles en el agua.")
            info1.putExtra("conservacion", "Considerada una especie invasora en muchas partes del mundo, su introducción ha tenido impactos negativos significativos en los ecosistemas locales, desplazando a especies nativas y alterando cadenas alimenticias.")
            info1.putExtra("curiosidad", "La Rana Toro es valorada comercialmente en algunas regiones por su carne y en otros lugares ha sido introducida para la acuicultura. Sin embargo, su propagación descontrolada representa una amenaza para la biodiversidad.")
            startActivity(info1)
        }

        imageButton21.setOnClickListener {
            info1.putExtra("nombre", "Serpiente Ciega Afroasiática/Indotyphlops braminus")
            info1.putExtra("descripcion", "La Serpiente Ciega Afroasiática es una especie de serpiente pequeña y delgada, sin patas y con cuerpo cilíndrico. Su coloración varía desde el marrón claro al marrón oscuro. Puede alcanzar una longitud de hasta 18 cm.")
            info1.putExtra("habitat", "Es originaria de las regiones tropicales y subtropicales de África, Asia y ha sido introducida en muchas partes del mundo. Prefiere hábitats húmedos como bosques, selvas tropicales, jardines y zonas urbanas.")
            info1.putExtra("dieta", "Es carnívora, alimentándose principalmente de pequeños invertebrados como lombrices, insectos y larvas que encuentra bajo tierra.")
            info1.putExtra("comportamiento", "Es una serpiente subterránea y nocturna, pasando la mayor parte de su vida bajo tierra o en sustratos vegetativos. Tiene un cuerpo adaptado para cavar y moverse eficientemente en el suelo.")
            info1.putExtra("reproduccion", "Es ovípara y pone huevos pequeños que deposita bajo tierra. Las crías emergen completamente formadas, sin necesidad de un periodo larval como otras serpientes.")
            info1.putExtra("conservacion", "No se considera una especie amenazada debido a su amplia distribución y adaptabilidad a diferentes hábitats. Sin embargo, su capacidad para prosperar en ambientes modificados por humanos la convierte en una especie común en muchas áreas urbanas.")
            info1.putExtra("curiosidad", "La Serpiente Ciega Afroasiática es conocida por su estilo de vida subterráneo y su capacidad para vivir en hábitats perturbados. A menudo es vista como una especie beneficiosa debido a su dieta de insectos y larvas, ayudando en el control de plagas.")
            startActivity(info1)
        }

        imageButton22.setOnClickListener {
            info1.putExtra("nombre", "Didelphis virginiana")
            info1.putExtra("descripcion", "El Tlacuache Norteño es una especie de marsupial de tamaño mediano con pelaje áspero y colores que varían entre gris y marrón. Puede alcanzar una longitud de hasta 40-50 cm, excluyendo la cola, que puede medir otros 25-40 cm.")
            info1.putExtra("habitat", "Es nativo de América del Norte, desde Canadá hasta América Central. Se encuentra en una amplia variedad de hábitats, incluyendo bosques, zonas suburbanas y urbanas, así como áreas cercanas a cuerpos de agua.")
            info1.putExtra("dieta", "Es omnívoro, alimentándose de una amplia gama de alimentos que incluyen frutas, insectos, pequeños mamíferos, aves, carroña y alimentos humanos disponibles en áreas urbanas.")
            info1.putExtra("comportamiento", "Es principalmente nocturno y solitario, aunque puede ser más activo durante el día en áreas con menos disturbios humanos. Es conocido por ser un excelente escalador y nadador.")
            info1.putExtra("reproduccion", "Es vivíparo y las crías nacen bajo desarrollo y se aferran a las mamas de la madre, donde completan su desarrollo inicial. Son capaces de reproducirse rápidamente y tienen camadas numerosas.")
            info1.putExtra("conservacion", "Es una especie adaptable y generalista que no se considera en peligro de extinción. Sin embargo, enfrenta amenazas locales debido a la pérdida de hábitat y atropellos en áreas urbanas y suburbanas.")
            info1.putExtra("curiosidad", "El Tlacuache Norteño es conocido por su capacidad para sobrevivir en una variedad de ambientes, adaptándose bien a la presencia humana. Es considerado beneficioso por su papel en el control de plagas y en la dispersión de semillas.")
            startActivity(info1)
        }

        imageButton23.setOnClickListener {
            info1.putExtra("nombre", "Tortuga Pecho Quebrado Mexicana/Kinosternon integrum")
            info1.putExtra("descripcion", "La Tortuga Pecho Quebrado Mexicana es una especie de tortuga de tamaño mediano con un caparazón de forma ovalada y colores que varían desde marrón hasta negro. Puede alcanzar una longitud de hasta 15-20 cm.")
            info1.putExtra("habitat", "Es endémica de México, específicamente se encuentra en cuerpos de agua dulce como lagos, estanques, ríos de corriente lenta y zonas palustres en diversas partes del país.")
            info1.putExtra("dieta", "Es omnívora, alimentándose principalmente de plantas acuáticas, algas, insectos, crustáceos, moluscos y carroña que encuentra en el fondo de los cuerpos de agua.")
            info1.putExtra("comportamiento", "Es semiacuática y pasa la mayor parte de su tiempo en el agua, emergiendo ocasionalmente para tomar el sol o buscar alimento en tierra. Es conocida por su capacidad de enterrarse en el lodo durante periodos de sequía.")
            info1.putExtra("reproduccion", "Es ovípara y las hembras ponen entre 2 a 10 huevos en nidos excavados en la tierra cerca de cuerpos de agua. Los huevos eclosionan después de un periodo de incubación y las crías se dirigen directamente hacia el agua.")
            info1.putExtra("conservacion", "Aunque no se considera una especie en peligro de extinción, algunas poblaciones locales pueden enfrentar amenazas debido a la pérdida y degradación de su hábitat, así como la contaminación de cuerpos de agua.")
            info1.putExtra("curiosidad", "La Tortuga Pecho Quebrado Mexicana debe su nombre a la estructura de su plastrón (parte inferior del caparazón), que tiene una forma distintiva con una quilla en el centro, aparentando estar 'quebrado'.")
            startActivity(info1)
        }

        imageButton24.setOnClickListener {
            info1.putExtra("nombre", "Zanate Mayor/Quiscalus mexicanus")
            info1.putExtra("descripcion", "El Zanate Mayor es una especie de ave paseriforme de tamaño mediano a grande, con un plumaje negro brillante y un brillo púrpura o azul en la luz. Puede alcanzar una longitud de hasta 33-38 cm.")
            info1.putExtra("habitat", "Es nativo de México y se encuentra comúnmente en una variedad de hábitats abiertos y semiabiertos, incluyendo áreas urbanas, bosques, bordes de ríos y campos agrícolas.")
            info1.putExtra("dieta", "Es omnívoro, alimentándose principalmente de frutas, semillas, insectos, pequeños vertebrados, huevos y carroña. Es conocido por su capacidad para adaptarse y aprovechar recursos humanos, como basureros y áreas urbanas.")
            info1.putExtra("comportamiento", "Es social y gregario, formando grandes bandadas durante la mayor parte del año. Es un ave vocal y emite una variedad de llamadas, incluyendo un característico graznido metálico.")
            info1.putExtra("reproduccion", "Anida en colonias, construyendo nidos voluminosos con ramas y hierbas en árboles, arbustos o estructuras humanas. La hembra pone de 3 a 5 huevos y ambos padres participan en la incubación y cuidado de los polluelos.")
            info1.putExtra("conservacion", "Es una especie común y no se considera en peligro de extinción. Su capacidad para adaptarse a una variedad de hábitats y su asociación con áreas urbanas le proporcionan una relativa estabilidad poblacional.")
            info1.putExtra("curiosidad", "El Zanate Mayor es un ave notable por su inteligencia y adaptabilidad. Se le puede observar con frecuencia en áreas urbanas donde se alimenta de restos de comida humana y actúa como un eficiente controlador de plagas.")
            startActivity(info1)
        }




        // Load achievement statuses
        loadAchievementStatuses()
    }

    private fun loadAchievementStatuses() {
        val sharedPreferences = getSharedPreferences(Utilidades.sharedPrefFile, Context.MODE_PRIVATE)

        val achievement1Completed = sharedPreferences.getBoolean(Utilidades.achievement1Key, false)
        val achievement2Completed = sharedPreferences.getBoolean(Utilidades.achievement2Key, false)
        val achievement3Completed = sharedPreferences.getBoolean(Utilidades.achievement3Key, false)
        val achievement4Completed = sharedPreferences.getBoolean(Utilidades.achievement4Key, false)
        val achievement5Completed = sharedPreferences.getBoolean(Utilidades.achievement5Key, false)
        val achievement6Completed = sharedPreferences.getBoolean(Utilidades.achievement6Key, false)
        val achievement7Completed = sharedPreferences.getBoolean(Utilidades.achievement7Key, false)
        val achievement8Completed = sharedPreferences.getBoolean(Utilidades.achievement8Key, false)
        val achievement9Completed = sharedPreferences.getBoolean(Utilidades.achievement9Key, false)
        val achievement10Completed = sharedPreferences.getBoolean(Utilidades.achievement10Key, false)
        val achievement11Completed = sharedPreferences.getBoolean(Utilidades.achievement11Key, false)
        val achievement12Completed = sharedPreferences.getBoolean(Utilidades.achievement12Key, false)
        val achievement13Completed = sharedPreferences.getBoolean(Utilidades.achievement13Key, false)
        val achievement14Completed = sharedPreferences.getBoolean(Utilidades.achievement14Key, false)
        val achievement15Completed = sharedPreferences.getBoolean(Utilidades.achievement15Key, false)
        val achievement16Completed = sharedPreferences.getBoolean(Utilidades.achievement16Key, false)
        val achievement17Completed = sharedPreferences.getBoolean(Utilidades.achievement17Key, false)
        val achievement18Completed = sharedPreferences.getBoolean(Utilidades.achievement18Key, false)
        val achievement19Completed = sharedPreferences.getBoolean(Utilidades.achievement19Key, false)
        val achievement20Completed = sharedPreferences.getBoolean(Utilidades.achievement20Key, false)
        val achievement21Completed = sharedPreferences.getBoolean(Utilidades.achievement21Key, false)
        val achievement22Completed = sharedPreferences.getBoolean(Utilidades.achievement22Key, false)
        val achievement23Completed = sharedPreferences.getBoolean(Utilidades.achievement23Key, false)
        val achievement24Completed = sharedPreferences.getBoolean(Utilidades.achievement24Key, false)

        imageButton1.visibility = if (achievement1Completed) View.VISIBLE else View.GONE
        imageButton2.visibility = if (achievement2Completed) View.VISIBLE else View.GONE
        imageButton3.visibility = if (achievement3Completed) View.VISIBLE else View.GONE
        imageButton4.visibility = if (achievement4Completed) View.VISIBLE else View.GONE
        imageButton5.visibility = if (achievement5Completed) View.VISIBLE else View.GONE
        imageButton6.visibility = if (achievement6Completed) View.VISIBLE else View.GONE
        imageButton7.visibility = if (achievement7Completed) View.VISIBLE else View.GONE
        imageButton8.visibility = if (achievement8Completed) View.VISIBLE else View.GONE
        imageButton9.visibility = if (achievement9Completed) View.VISIBLE else View.GONE
        imageButton10.visibility = if (achievement10Completed) View.VISIBLE else View.GONE
        imageButton11.visibility = if (achievement11Completed) View.VISIBLE else View.GONE
        imageButton12.visibility = if (achievement12Completed) View.VISIBLE else View.GONE
        imageButton13.visibility = if (achievement13Completed) View.VISIBLE else View.GONE
        imageButton14.visibility = if (achievement14Completed) View.VISIBLE else View.GONE
        imageButton15.visibility = if (achievement15Completed) View.VISIBLE else View.GONE
        imageButton16.visibility = if (achievement16Completed) View.VISIBLE else View.GONE
        imageButton17.visibility = if (achievement17Completed) View.VISIBLE else View.GONE
        imageButton18.visibility = if (achievement18Completed) View.VISIBLE else View.GONE
        imageButton19.visibility = if (achievement19Completed) View.VISIBLE else View.GONE
        imageButton20.visibility = if (achievement20Completed) View.VISIBLE else View.GONE
        imageButton21.visibility = if (achievement21Completed) View.VISIBLE else View.GONE
        imageButton22.visibility = if (achievement22Completed) View.VISIBLE else View.GONE
        imageButton23.visibility = if (achievement23Completed) View.VISIBLE else View.GONE
        imageButton24.visibility = if (achievement24Completed) View.VISIBLE else View.GONE
    }
}
