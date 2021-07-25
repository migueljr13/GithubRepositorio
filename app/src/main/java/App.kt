import android.app.Application
import di.DataModule
import domain.di.DomainModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import presentation.di.PresentationModule

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModule.load()
        DomainModule.load()
        PresentationModule.load()
    }
}