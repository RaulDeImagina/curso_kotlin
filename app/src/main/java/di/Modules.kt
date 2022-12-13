package di

import android.app.Application
import org.koin.dsl.module
import xyz.gonzapico.imaginaformacion_test.UserPresenter
import xyz.gonzapico.imaginaformacion_test.UserView

class Modules {

    val mvpModue = module {
        factory { (userView: UserView) -> UserPresenter(userView) }
    }

    val allModules = mvpModule
}

class IFApp : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger(org.koin.core.logger.Level.DEBUG)
            androidContext(this@IFApp)
            modules(allModules)
        }
    }
}