EmailAutoCompleteTextView
=========================

[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-EmailAutoCompleteTextView-brightgreen.svg?style=flat)](http://android-arsenal.com/details/1/2743)
[![Build Status](https://travis-ci.org/tasomaniac/EmailAutoCompleteTextView.png?branch=master)](https://travis-ci.org/tasomaniac/EmailAutoCompleteTextView)
[![License](http://img.shields.io/:license-apache-blue.svg)](http://www.apache.org/licenses/LICENSE-2.0.html)

An AutoCompleteTextView with builtin Adapter with the emails in the device.

The library automatically adds GET_ACCOUNTS permission into your Manifest. For Android Marshmallow, the library also
handles runtime permissions automagically.

- If the permission is already given by the user, or if the device is below Android M, it
setups itself and auto completion of email addresses works right away. 
- If the permission is not given, there will be a checkbox shown below the view to indicate that we require the permission.
- If the user chooses "never", the checkbox will be hidden.

![](demo.gif)

Usage
-----

The library is heavily influced by `TextInputLayout` from the design support library.

Just like the `TextInputLayout` you need to add `AutoCompleteTextView` inside in the xml as a child.

```xml
  <com.tasomaniac.widget.EmailAutoCompleteLayout
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    app:permissionText="@string/permission_text">

    <AutoCompleteTextView
      android:layout_width="match_parent"
      android:layout_height="wrap_content"/>
  </com.tasomaniac.widget.EmailAutoCompleteLayout>
```

Usage with Design Support Lib
-----------------------------

You may want to use `TextInputLayout` to have beautiful label animation you find the GIF above. In that case, you can use the alternative dependency with `-design` postfix and you will be good to go. It will automatically use the design library version and it will have all the features of `TextInputLayout`

Download
--------

Dependency to just use `EmailAutoCompleteLayout`

```groovy
compile 'com.tasomaniac:emailautocompletetextview:0.2'
```

Dependency to use with `TextInputLayout`

```groovy
compile 'com.tasomaniac:emailautocompletetextview-design:0.2'
```

Snapshots of the development version are available in [Sonatype's `snapshots` repository][snap].

License
-------

    Copyright (C) 2015 Said Tahsin Dane

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.



 [snap]: https://oss.sonatype.org/content/repositories/snapshots/
