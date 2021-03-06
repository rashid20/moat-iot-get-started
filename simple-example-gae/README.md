MOAT IoT Application Example
========
Simple Example Google App Engine Application
--------

This application can be deployed on Google App Engine and is already applied Twitter Bootstrap 2.2.2.
The version of Google App Engine SDK used here is 1.7.6/1.7.7.1.

See [the tutorial](http://dev.yourinventit.com/guides/get-started) to learn more.

You can build and start a web application running on your localhost as Development mode or alternatively deploying on Google App Engine instance associated with your Google Account as Production mode.

In the Production mode, this application restricts access from the internet. You can set your google account to `GOOGLE_USER_ID` property in `constants.properties` under the `src` folder.

## How to setup

After `git clone` or download and unarchive the zip file from the [moat-iot-get-started](https://github.com/inventit/moat-iot-get-started) project, do the following.

  1. Install [Eclipse Juno (4.2)](http://www.eclipse.org/downloads/)
  1. Install [Google App Engine Plugin (1.7.7.1)](https://developers.google.com/appengine/docs/java/tools/eclipse)
  1. Import this `simple-example-gae` project [from File > Import...](http://help.eclipse.org/juno/index.jsp?topic=%2Forg.eclipse.platform.doc.user%2Ftasks%2Ftasks-importproject.htm)
  1. Run `build.xml` file at the `simple-example-gae` directory by right-clicking the `build.xml` and choosing `1 Ant Build`

## How to start the app

  1. Launch Eclipse
  1. Right-Click the `simple-example-gae` from the Package Explorer
  1. Choose `Run As`, then click `Web Application`
  1. Open the Browser and enter `http://localhost:8888`, and you can see the top page
  1. When you get HTTP 500 error, you need to update constants.properties under the `src` directory. The credentials values are acquired when you sign up to [Inventit IoT Developer Network Sandbox Server](http://dev.yourinventit.com/guides/get-started)

## Directories

The directory structure of this application is as follows:

    |-- src (2)
    |   |-- com
    |   |   `-- yourinventit
    |   |       `-- moat
    |   |           `-- gae
    |   |               `-- example
    |   |                   |-- controllers
    |   |                   `-- models (1)
    |   `-- META-INF
    `-- war
        |-- images
        |   `-- bootstrap (B)
        |-- javascripts
        |   `-- bootstrap (B)
        |-- stylesheets
        |   `-- bootstrap (B)
        `-- WEB-INF
            |-- classes
            `-- lib

- (1) Moat* and Sys* files are basic implementation of MOAT REST client
- (2) constants.properties contains declaration for `applicationId`, `pacakgeId`, `clientId`, `clientSecret` and `googleAccount`
- (B) where Twitter Bootstrap files exist
