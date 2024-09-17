Dependency Injection (DI) is a design pattern that allows the seperation of object creation make loosely coupled.


#                  DI 
                  
1. Manual DI                  2. Automatic DI

      
Manual DI 

-- 1. Constructor Injection - we pass a dependency of class to its constructor.


-- 2. Field Injection - dependency are instantiated after the class created.
          
          
-- 3. Automatic DI - we don't have to create each object for every class.
                
                
                1. Dagger - manages projects dependency complexity dagger creates a graph of object.
                      @Module - used to construct objects & provide dependencies.
                      @Provides - used over method in the module class that returns object.
                      @Inject - used over fields constructor or method that indicate dependencies are requested.
                      @Component - interface act as bridge between @Module and @Inject.
                      @Singleton - indicates single instance of object.
                
                
                2. Hilt - reduces manual DI. 
                          Provides container for every class in your project and manages lifecycle automatically.
                

implementation ("com.google.dagger:dagger:2.48.1")
kapt ("com.google.dagger:dagger-compiler:2.48.1")

To use dagger we need module object and component interface that will access in main.
@Module is used after creating all those component rebuild the project java(generated) directory gets created.
In the directory you can able to see factory class.
Factory class used to create instance of object.

