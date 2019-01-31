package prac.app.koinxcoroutinepractice2019

import org.koin.android.viewmodel.experimental.builder.viewModel
import org.koin.dsl.module.module


val appModule = module {

    single<SharedprefModule> { SharedprefModule(get())  }

}
