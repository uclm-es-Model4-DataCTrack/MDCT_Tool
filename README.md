# MDCT_Tool

This repository contains the sources of the plug-ins conforming the Model4_DataCTrack profile modeling tool for the Papyrus 5.2.0 eclipse modeling plug-in.

There are different options available for the installation and use of this tool:

  The easiest option is to install the tool from the update site https://dsi.uclm.es/cloud/modeling/model4datactrack/releases/1/, for this it is recommended to remove all the alternative update sites and include only the default Papyrus 5.2.0 update site. To do this follow the next steps:     
    1. Click on "Help -> Install New Software...".
    2. In the pop-up select "Manage" and remove or deselect all the update sites.
    3. Click on "Add".
    4. In the new dialog enter a name for the site and enter the location for the defaul 5.2.0 update site:
    
    https://download.eclipse.org/modeling/mdt/papyrus/updates/releases/2021-09/
    
  After that the installation can be done in two ways. For the first option, the online installation, in Papyrus:       
    1. Click on "Help -> Install New Software...".
    2. Include the previous link in the field "Work with".
    3. It will locate the M4DCT category or feature, depending on whether or not the box Group elements by category is checked.
    4. Click on next and wait for the requirements check, then click on next again if there are no errors.    
    5. Accept the terms and click on "Finish" to begin the installation.
      
 The other option is to install the plug-in offline. For this, again in the update site, a link has been added to download a zip with the installation files, then:
    1. Click on "Help -> Install New Software...".
    2. Then click on "Add".
    3. When the "Add Repository" pop-up shows select "Archive".
    4. Select the zip file that you have just downloaded.
    5. Repeat the same last two steps of the online installation. 
  
  Additionally, users can directly clone or download a zip file with the contents of this repo and run the code in a papyrus runtime instance. The first option is to download or clone this repo and open all the projects, except .feature and .site, into your papyrus workspace and execute them. For this, it will be necessary to manually install the dsml.validation plug-in. This can be done following the next steps:
    1. Click on "Help -> Install New Software...".
    2. In the pop-up select "Manage".
    3. Click on "Add".
    4. In the new dialog enter a name for the site and enter the location for dsml.validation update site:
    https://download.eclipse.org/modeling/mdt/papyrus/components/incubation/dsml.validation/updates/oxygen/1.2.0/
    5. Apply the cahnges and reopen the install new software dialog.
    6. Choose the new site in the dropdown list "Work with".
    7. Select the DSML Validation features and click next.
    8. Click on next and wait for the requirements check, then click on next again if there are no errors.
    9. Accept the terms and click on "Finish" to begin the installation. 
  
  The last option is to install the tool from the .site project, this can be done following the same steps as for the offline installation but selecting "Local" instead of "Archive" in step 3. For this way of installing it is not necessary to install dsml.validation.
