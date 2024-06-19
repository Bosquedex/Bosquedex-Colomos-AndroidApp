package com.bosquedex.bosquedexcolomos


import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.result.PickVisualMediaRequest
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.drawToBitmap
import org.pytorch.IValue
import org.pytorch.LiteModuleLoader
import org.pytorch.MemoryFormat
import org.pytorch.Module
import org.pytorch.torchvision.TensorImageUtils
import java.io.File
import java.io.FileOutputStream
import java.io.IOException
import java.io.InputStream

class CameraActivity : AppCompatActivity() {

    lateinit var randomBtn:Button
    lateinit var resultTv:TextView
    lateinit var imgView:ImageButton
    lateinit var imgPhantom:ImageButton
    var imagenACargar = null
    val pickMedia = registerForActivityResult(ActivityResultContracts.PickVisualMedia()){uri->
        if(uri!=null){
            //val bitmap2: Bitmap =ImageDecoder.decodeBitmap(source)
            imgView.setImageURI(uri)
            imgPhantom.setImageURI(uri)
            randomBtn.setText("Identificar")
            resultTv.setText("Imagen Cargada")
        }else{
            resultTv.setText("Ingresa una imagen")
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_camera)
        /**
        var bitmap: Bitmap? = null
        var module: Module? = null
          val imageView = findViewById<ImageView>(R.id.imageView)
         **/

        val modelo = "model_savedV21.ptl"

        randomBtn = findViewById(R.id.btnIdentificar)
        resultTv = findViewById(R.id.textViewResult)
        imgView = findViewById(R.id.imageView)
        imgPhantom = findViewById(R.id.phantomView)

       // val imageContract = registerForActivityResult(ActivityResultContracts.GetContent()){
           // imgView.setImageURI(it)
            //imgPhantom.setImageURI(it)
       // }

        //Crea el bitmap de una imagen precargada
        //imgView.setImageBitmap(createBitmap(imagenACargar))

        imgView.setOnClickListener{

             pickMedia.launch(PickVisualMediaRequest(ActivityResultContracts.PickVisualMedia.ImageOnly))

            }

        randomBtn.setOnClickListener {
            if (randomBtn.text == "Identificar") {
           //     imageContract
                resultTv.text = createPrediction(modelo, imagenACargar)
                if (resultTv.text == "NI") {
                    randomBtn.text = "No Identificado"
                } else {
                    randomBtn.text = "Identificado"
                }
            }
        }



    }

    private fun createPrediction(modelo:String, imagenACargar:String? ):String {

        val module = createModule(modelo)
        //val bitmap = createBitmap(imagenACargar)
        val bitmap = createBitmap()


        //image to tensor
        val inputTensor = TensorImageUtils.bitmapToFloat32Tensor(
            bitmap,
            TensorImageUtils.TORCHVISION_NORM_MEAN_RGB,
            TensorImageUtils.TORCHVISION_NORM_STD_RGB,
            MemoryFormat.CHANNELS_LAST
        )

        // running the model
        val outputTensor = module!!.forward(IValue.from(inputTensor)).toTensor()

        // getting tensor content as java array of floats
        val scores = outputTensor.dataAsFloatArray



        //val clases = arrayOf("Gato", "Perro")
        //val clases = arrayOf("Ardilla", "Rana")
        val clases = arrayOf("AbaniquilloPagnueloPacifico", "AlicanteCentro", "ArdillaRoca", "Bejuquilla", "CarpaChina", "CarpaComunEuropea", "CarpinteroCheje", "ColibriVerde", "ConejoSerrano", "GarsaBlanca", "IguanaVerde", "LagartoEscorpionDeArizona", "MurcielagoFrutero", "PalomaDomestica", "PatoReal", "RanaFisgonaDeslumbrante", "RanaLadradoraCostegna", "RanaLeopardoNeovolcanica", "RanaLeopardoNoroeste", "RanaToro", "SerpienteCiegaAfroasiatica", "TlacuacheNortegno", "TortugaPechoQuebradoMexicana", "ZanateMayor")

        // searching for the index with maximum score
        var maxScore = -Float.MAX_VALUE
        var maxScoreIdx = -1


        Log.i("score", "-------------------------------------------------------------------")
        for (n in scores.indices) {
            Log.i("score", "Clase ${clases[n]} de Imagen: ${scores[n]}")
            if (scores[n] > maxScore) {
                maxScore = scores[n]
                maxScoreIdx = n
            }
        }

        if (maxScore < .6){
            return "NI"
        }

        when(clases[maxScoreIdx]) {
            "AbaniquilloPagnueloPacifico" ->Utilidades.completarLogro(Utilidades.achievement1Key, applicationContext)
            "AlicanteCentro" ->Utilidades.completarLogro(Utilidades.achievement2Key, applicationContext)
            "ArdillaRoca"  ->Utilidades.completarLogro(Utilidades.achievement3Key, applicationContext)
            "Bejuquilla"  ->Utilidades.completarLogro(Utilidades.achievement4Key, applicationContext)
            "CarpaChina"  ->Utilidades.completarLogro(Utilidades.achievement5Key, applicationContext)
            "CarpaComunEuropea"  ->Utilidades.completarLogro(Utilidades.achievement6Key, applicationContext)
            "CarpinteroCheje"  ->Utilidades.completarLogro(Utilidades.achievement7Key, applicationContext)
            "ColibriVerde" ->Utilidades.completarLogro(Utilidades.achievement8Key, applicationContext)
            "ConejoSerrano" ->Utilidades.completarLogro(Utilidades.achievement9Key, applicationContext)
            "GarsaBlanca"  ->Utilidades.completarLogro(Utilidades.achievement10Key, applicationContext)
            "IguanaVerde" ->Utilidades.completarLogro(Utilidades.achievement11Key, applicationContext)
            "LagartoEscorpionDeArizona"  ->Utilidades.completarLogro(Utilidades.achievement12Key, applicationContext)
            "MurcielagoFrutero"  ->Utilidades.completarLogro(Utilidades.achievement13Key, applicationContext)
            "PalomaDomestica"  ->Utilidades.completarLogro(Utilidades.achievement14Key, applicationContext)
            "PatoReal"  ->Utilidades.completarLogro(Utilidades.achievement15Key, applicationContext)
            "RanaFisgonaDeslumbrante"  ->Utilidades.completarLogro(Utilidades.achievement16Key, applicationContext)
            "RanaLadradoraCostegna"  ->Utilidades.completarLogro(Utilidades.achievement17Key, applicationContext)
            "RanaLeopardoNeovolcanica"  ->Utilidades.completarLogro(Utilidades.achievement18Key, applicationContext)
            "RanaLeopardoNoroeste"  ->Utilidades.completarLogro(Utilidades.achievement19Key, applicationContext)
            "RanaToro"  ->Utilidades.completarLogro(Utilidades.achievement20Key, applicationContext)
            "SerpienteCiegaAfroasiatica"  ->Utilidades.completarLogro(Utilidades.achievement21Key, applicationContext)
            "TlacuacheNortegno"  ->Utilidades.completarLogro(Utilidades.achievement22Key, applicationContext)
            "TortugaPechoQuebradoMexicana" ->Utilidades.completarLogro(Utilidades.achievement23Key, applicationContext)
            "ZanateMayor" ->Utilidades.completarLogro(Utilidades.achievement24Key, applicationContext)
        }

        return clases[maxScoreIdx]

    }

    private fun createBitmap(imagenACargar:String): Bitmap? {
        var bitmap: Bitmap? = null
        try {
            val bitmap2:Bitmap = Bitmap.createBitmap(imgView.drawToBitmap())

            bitmap = BitmapFactory.decodeStream(assets.open(imagenACargar))

        }catch (e: IOException){

            Log.e("AssetError", "Error reading assets (Bitmap)", e)
            finish()
        }
        return bitmap
    }
    private fun createBitmap(): Bitmap? {
        var bitmap: Bitmap? = null
        try {
            bitmap = Bitmap.createBitmap(imgPhantom.drawToBitmap())

        }catch (e: IOException){

            Log.e("AssetError", "Error reading assets (Bitmap)", e)
            finish()
        }
        return bitmap
    }

    private fun createModule(modelo:String): Module? {
        var module: Module? = null

        try {
            module = LiteModuleLoader.load(assetFilePath(this, modelo))
            // loading serialized torchscript module from packaged into app android asset model.pt,
            // app/src/model/assets/model.pt


        } catch (e: IOException) {
            Log.e("AssetError", "Error reading assets (Module)", e)
            finish()
        }


        return module
    }

}

fun assetFilePath(context: Context, asset: String): String {
    val file = File(context.filesDir, asset)

    try {
        val inpStream: InputStream = context.assets.open(asset)
        try {
            val outStream = FileOutputStream(file, false)
            val buffer = ByteArray(4 * 1024)
            var read: Int

            while (true) {
                read = inpStream.read(buffer)
                if (read == -1) {
                    break
                }
                outStream.write(buffer, 0, read)
            }
            outStream.flush()
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return file.absolutePath
    } catch (e: Exception) {
        e.printStackTrace()
    }
    return ""
}
