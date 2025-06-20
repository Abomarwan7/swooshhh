Overview
This project is part of my ongoing journey to master Android development with Kotlin. In this exercise, I explored fundamental concepts related to Android activities, data passing, and debugging techniques.
1. Activity Lifecycle
Implemented and observed the complete activity lifecycle callbacks:

onCreate(), onStart(), onResume(), onPause(), onStop(), onDestroy(), onRestart()

Learned proper resource management across lifecycle states

Handled configuration changes and process death scenarios

2. Intent Context
Utilized context properly in different scenarios

Distinguished between application and activity context

Avoided memory leaks by managing context references appropriately

3. Activity-to-Activity Data Passing
Implemented explicit intents for navigation between activities

Passed primitive data types using intent extras

Returned data from secondary activities to primary activities

Handled intent data safely with null checks and default values

4. Parcelable Implementation
Made custom classes Parcelable for efficient Android IPC

Used @Parcelize annotation for simplified implementation

Passed complex objects between activities via intents

Compared Parcelable with Serializable approach

5. LogCat Debugging
Effectively used LogCat to monitor lifecycle events and debug issues
