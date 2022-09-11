package com.example.daggertutorials3

import dagger.Component
import dagger.Module
import dagger.Provides


@Component(modules = [AppModule::class])
interface AppComponent {
    fun computer(): Computer
}

@Module
object AppModule{

    @Provides
    fun provideComputer(
        processor: Processor,
        ram: RAM,
        motherboard: Motherboard
    ): Computer{
        return Computer(
            processor = processor,
            ram = ram,
            motherboard = motherboard,
        )
    }

    @Provides
    fun provideProcessor(): Processor{
        return Processor()
    }

    @Provides
    fun provideRam(): RAM{
        return RAM()
    }

    @Provides
    fun provideMotherboard(): Motherboard{
        return Motherboard()
    }
}
