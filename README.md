shopping-list
=============

Android app to manage your shopping list

Build and Run
==============

Change emulator
---------------
In shopping-list-app/pom.xml, change <emulator> in android maven plugin. (Emulator name should be given)

To start emulator
-----------------
cd shopping-list-app
mvn android:emulator-start


mvn clean install android:deploy

mvn android:emulator-stop

To deploy to device
-------------------
Connect device with usb cable
mvn android:devices - This should list all the devices(e.g:- emulator + device)
Stop emulator
mvn clean install android:deploy

View logs (when using emulator)
-------------------------------
In command shell run 'adb logcat'

