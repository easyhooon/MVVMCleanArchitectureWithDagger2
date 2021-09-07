package kr.ac.konkuk.tmdbclient.presentation.di.artist

import javax.inject.Scope

@Scope
@kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
annotation class ArtistScope

//This class don't need a class body.
//Now we use this newly created ArtistScope as the scope of
//ArtistViewModelFactory dependency