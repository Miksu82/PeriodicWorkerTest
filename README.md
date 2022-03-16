Rep instructions

1. Build the app
2. Run: `adb shell cmd jobscheduler run -f com.example.periodicworkertest 0`
3. See that the app logs "Periodic worker working..."
4. Run again: Run: `adb shell cmd jobscheduler run -f com.example.periodicworkertest 0`
	- Note: sometimes the id changes to 1
5. Nothing is logged anymore

Expected result: "Periodic worker working..." is logged everytime

```
adb shell cmd jobscheduler run -f com.example.periodicworkertest 0 is called
```