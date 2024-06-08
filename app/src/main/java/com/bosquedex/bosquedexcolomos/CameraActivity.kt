package com.bosquedex.bosquedexcolomos

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

import androidx.appcompat.app.AppCompatActivity

import com.bosquedex.bosquedexcolomos.databinding.ActivityCameraBinding
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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_camera)
        /**
        var bitmap: Bitmap? = null
        var module: Module? = null
         **/ val imageView = findViewById<ImageView>(R.id.imageView)



        /***
        // Code below is for checking that load + tensor convert to float + normalization is the same here and in Android
        // Code below is for checking that load + tensor convert to float + normalization is the same here and in Android
        val assetImage = BitmapFactory.decodeFile(assetFilePath2(this, "Ardilla.jpeg"))
        val tensor = TensorImageUtils.bitmapToFloat32Tensor(
        assetImage,
        TensorImageUtils.TORCHVISION_NORM_MEAN_RGB,
        TensorImageUtils.TORCHVISION_NORM_STD_RGB,
        MemoryFormat.CHANNELS_LAST
        )

        Log.i("image", "\"inputTensor[100,200,0] = \"  ${tensor.dataAsFloatArray[0 + 100 * 3 + 200 * 3 * 720]}")
        Log.i("image", "\"inputTensor[44,123,2] = \"  ${tensor.dataAsFloatArray[2 + 44 * 3 + 123 * 3 * 720]}")

         ***/



        //Ardillas
        val imagenACargar = "Ardilla.jpeg"
        // val imagenACargar = "cosa2.png"
        //val imagenACargar = "cosa3.png"

        //Bejuquillas
        //val imagenACargar = "Bejuquilla (24).jpeg"
        //val imagenACargar = "Bejuquilla (25).jpeg"

        //CarpaChina
        //val imagenACargar = "CarpaChina (1037).jpg"
        //val imagenACargar = "CarpaChina (1038).jpg"

        //CarpaComunEuropea
        //val imagenACargar = "CarpaComunEuropea (2671).jpeg"
        //val imagenACargar = "CarpaComunEuropea (2672).jpeg"


        //CarpinteroCheje

        //ColibriVerde

        //GarsaBlanca

        //IguanaVerde

        //Ranas
        // val imagenACargar = "Rana.jpeg"
        // val imagenACargar = "Rana2.jpg"

        //TlacuacheNortegno

        //Modelo de gatos y perros
        //val modelo = "my_model.ptl"
        //Modelo de Ardillas y Ranas
        //val modelo = "model_savedV13.ptl"
        //modelo 10 clases de animales
        val modelo = "model_savedV19.ptl"

        /**
        try {
        // creating bitmap from packaged into app android asset 'image.jpg',
        // app/src/main/assets/image.jpg
        bitmap = BitmapFactory.decodeStream(assets.open(imagenACargar))
        module = LiteModuleLoader.load(assetFilePath(this, modelo))
        // loading serialized torchscript module from packaged into app android asset model.pt,
        // app/src/model/assets/model.pt

        imageView.setImageBitmap(bitmap)

        } catch (e: IOException) {
        Log.e("PytorchHelloWorld", "Error reading assets", e)
        finish()
        }






        // running the model
        val outputTensor = module!!.forward(IValue.from(inputTensor)).toTensor()

        // getting tensor content as java array of floats
        val scores = outputTensor.dataAsFloatArray



        //val clases = arrayOf("Gato", "Perro")
        //val clases = arrayOf("Ardilla", "Rana")
        val clases = arrayOf("Ardilla", "Bejuquilla", "CarpaChina", "CarpaEuropea", "CarpinteroCheje", "ColibriVerde", "GarsaBlanca", "IguanaVerde",  "RanaToro", "TlacuacheNortegno")

        // searching for the index with maximum score
        var maxScore = -Float.MAX_VALUE
        var maxScoreIdx = -1
        Log.i("score", "-------------------------------------------------------------------")
        for (n in scores.indices) {
        Log.i("score", "Clase ${clases[n]} de ${imagenACargar}: ${scores[n].toString()}")
        if (scores[n] > maxScore) {
        maxScore = scores[n]
        maxScoreIdx = n
        }
        }

         **/
        /*
        val className: String
        if(maxScore>.6){
            className = "Ardilla"
        }else{
            className = "Rana"
        }

        //val className: String = ImageNetClasses.IMAGENET_CLASSES.get(maxScoreIdx)
        */

        val randomBtn = findViewById<Button>(R.id.btnRandom)
        val resultTv = findViewById<TextView>(R.id.textViewResult)

        imageView.setImageBitmap(createBitmap(imagenACargar))
        //val imageView = findViewById<ImageView>(R.id.imageView)
        randomBtn.setOnClickListener {
            resultTv.text = createPrediction(modelo, imagenACargar)

        }









    }





    /***
    fun getBytesFromBitmap(bitmap: Bitmap?): ByteArray? {
    if (bitmap != null) {
    val stream = ByteArrayOutputStream()
    bitmap.compress(Bitmap.CompressFormat.JPEG, 70, stream)
    return stream.toByteArray()
    }
    return null
    }
     ***/


    private fun createPrediction(modelo:String, imagenACargar:String ):String {

        val module = createModule(modelo)
        val bitmap = createBitmap(imagenACargar)

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
            Log.i("score", "Clase ${clases[n]} de ${imagenACargar}: ${scores[n].toString()}")
            if (scores[n] > maxScore) {
                maxScore = scores[n]
                maxScoreIdx = n
            }
        }


        return clases[maxScoreIdx]
    }

    private fun createBitmap(imagenACargar:String): Bitmap? {
        var bitmap: Bitmap? = null
        try {

            bitmap = BitmapFactory.decodeStream(assets.open(imagenACargar))

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