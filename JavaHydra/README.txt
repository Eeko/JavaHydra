Building JavaHydra
- - - - - - - - - -

Building is pretty straightforward. The only dependencies being in the Shamirs
Secret Sharing implementation (included with the source-code) and with the Axis2
libraries used to handle the interaction with web-services. The UI is a standard
Swing-application for which the libraries are included with most modern JDKs.

To create a Java Web Start -launchable version, build the program as a runnable
.jar -file with org.glite.data.hydra.javacli.ui.Gui being the entry-point. Then
modify the included launch.jnlp file to match your server-settings and include
that with the compiled JavaHydra.jar to a directory in your web-server. Then
direct your browser to the url ending with /launch.jnlp and the JWS should
handle the rest if it's configured correctly



Using the client
- - - - - - - - -

With Default-configuration, you need to specify 
    
    1) a settings.xml -file containing the endpoint addresses of the
    hydra-servers to be used 
    2) a client certificate used to authenticate your client with the hydra-
    server
    3) a server-certificate used to authenticate the endpoints to the client.

If your default JVM keystores include the certificates, you should not need to
specify these files. The settings.xml file is similar to one used by the
C-implementation of Hydra Client. A sample .xml file is included in the
/resources/ folder of the project.

The software supports PKCS12 (.p12) and Java KeyStore formats (.jks or .ts) for
certificate storage and encryption. By default, the program asks for password
used to unlock the files. PKCS12 format is offered by default from Mozilla
Firefox certificate export, so user can use those certificates directly for
authentication.

When the settings are configured correctly, you can specify the file to be
operated and the desired cipher operation within the "Hydra Crypt" tab. If a
file corresponding your username and filename is found within the hydra-servers,
the client moves to decrypt mode. If there is no entry for the file, client
creates an entry and tries to encrypt the file. After either scenario, the
program asks where do you want to save your output within your file system..

To use the AES-256 encryption, you need to install the "Java Cryptography
Extension (JCE) Unlimited Strength Jurisdiction Policy Files" for your JRE.
Though this has not been tested with current implementation.



Using the libraries without the GUI
- - - - - - - - - - - - - - - - - -

All components needed for using the solution are within
org.glite.data.hydra.javacli.core -package.

Overview of the classes:
    - HydraAuth.java
      Handles the authentication and certificate reading procedures if the JVM
      is not configured by itself to support your 2-way SSL authentication
    - HydraConnection.java
      Class to establish and utilize singular connections to different
      hydra-webservices. Eg. contains class to ask for a single key-fragment.
    - HydraCrypt.java
      Provides an interface for performing cryptographic operations via JCE
      utilizing our own HydraKeys.
    - HydraFileHandler.java
      Used for reading and writing files in the demo-app. Since Hydra does not
      necessarily need to work with system-io much, this should not be a very
      essential class to work with.
    - HydraKey.java
      Contains the extended SecretKeySpec used to store Hydra-compatible
      encryption keys locally. And contains the functions to split, reconstruct 
      etc. the keys using the included OpenSource Shamirs Secret Sharing 
      implementation.
    - HydraSettings.java
      A settings file mainly reading & storing the server-configuration and
      authentication certificate-locations in memory. Ie. the static Hydra-
      interaction methods in HydraConnection.java take an array of 
      HydraConnections as a parameter, which are stored in a HydraSettings-
      instance.
    - HydraUtils.java
      Helper functions needed in multiple locations of the software.


