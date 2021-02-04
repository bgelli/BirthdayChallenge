# BirthdayChallenge

The project was started by using the Android Studio's Fragment + ViewModel template.

#### Main technical parts/frameworks

### MVVM and single activity architecture
* Default support from Google via ViewModels
* Easy to implement navigation with the navigation component
* databinding

#### Koin as DI framework
* Simple, easy to understan (dagger not)
* Supports viewModel injection with constructor paramters (Hilt does not)

#### Retrofit nad OkHttp for networkng

#### Moshi
* Code generation over reflecion
* Supports Kotlin's default argumets

### Left out parts because of time limit
- Implementing the communication between the detail VM and repository layer
- Loading indicators
- Error handling
- Proper communication between viewmodels and repositories, probably via coroutines (becasue retrofit supports coroutines and the ViewModel has the viewModelScope)
- databinding

##### Contact
gelllike@gmail.com
