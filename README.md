# LifeCycleDemo
## lifeCycle
1.利用MVP加lifeCycle就可以解耦更加彻底，减少了Activity中的代码量和各种重复的代码，很少到1000多行的Activity代码了</br>

2.同时也可以更好地处理MVP中的生命周期的问题，防止发生内存泄漏</br>

## 原理（很简单，不必深究）
如果让我们自己想实现这样的功能，建一个baseActivity，对各个生命周期进行依赖注入就OK了；不过，既然Android SDK就提供这个，何不使用呢
