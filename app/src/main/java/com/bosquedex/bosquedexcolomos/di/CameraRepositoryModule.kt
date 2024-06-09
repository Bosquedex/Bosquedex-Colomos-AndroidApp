package com.bosquedex.bosquedexcolomos.di

//import com.ahmed_apps.camerax_app.data.repository.CameraRepositoryImpl
//import com.ahmed_apps.camerax_app.domain.repository.CameraRepository
//import com.bosquedex.bosquedexcolomos.domain.CameraRepository

import com.bosquedex.bosquedexcolomos.domain.CameraRepository
import com.bosquedex.bosquedexcolomos.repository.CameraRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class CameraRepositoryModule {

    @Binds
    @Singleton
    abstract fun bindCameraRepository(
        cameraRepositoryImpl: CameraRepositoryImpl
    ): CameraRepository

}