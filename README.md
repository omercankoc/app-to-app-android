## App to App Broadcast Receiver
## First Application
Application that will receive the sent signal. 
### Add permission for other app's access.
```xml
<uses-permission android:name="application.permission"></uses-permission>
```
### Add the receiver and configure it.
```xml
<receiver
    android:name=".SignalBroadcast"
    android:exported="true">
    <intent-filter>
        <action android:name="application.signal" />
    </intent-filter>
</receiver>
```
### BroadcastReceiver class that listens for the incoming signal.
```kotlin
class SignalBroadcast : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        Toast.makeText(context,"Signal received from other application!",Toast.LENGTH_LONG).show()
    }
}
```
## Second App
The application that sends the signal.
### Add permissions to access other app.
```xml
<permission
    android:name="application.permission"
    android:protectionLevel="signature">
</permission>
```
### Send signal to other application.
```kotlin
fun signal(view : View){
    val intent : Intent = Intent("application.signal")
    sendBroadcast(intent,"application.permission")
}
```

