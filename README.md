## App to App Broadcast Receiver
### First Application

Application that will receive the sent signal. First, let's add the necessary permissions to the manifest file.

Add permission to access from other app.

```xml
<uses-permission android:name="application.permission"></uses-permission>
```

Add the receiver and configure it.

```xml
<receiver
    android:name=".SignalBroadcast"
    android:exported="true">
    <intent-filter>
        <action android:name="application.signal" />
    </intent-filter>
</receiver>
```

Create the BroadcastReceiver class.

```kotlin
class SignalBroadcast : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        Toast.makeText(context,"Signal received from other application!",Toast.LENGTH_LONG).show()
    }
}
```
