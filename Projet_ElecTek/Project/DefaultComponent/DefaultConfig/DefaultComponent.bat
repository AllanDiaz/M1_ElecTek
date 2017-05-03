echo off

set RHAP_JARS_DIR=C:/ProgramData/IBM/Rational/Rhapsody/8.1.5/Share\LangJava\lib
set FRAMEWORK_NONE_JARS=C:/ProgramData/IBM/Rational/Rhapsody/8.1.5/Share\LangJava\lib\oxf.jar;C:/ProgramData/IBM/Rational/Rhapsody/8.1.5/Share\LangJava\lib\anim.jar;C:/ProgramData/IBM/Rational/Rhapsody/8.1.5/Share\LangJava\lib\animcom.jar;C:/ProgramData/IBM/Rational/Rhapsody/8.1.5/Share\LangJava\lib\oxfInstMock.jar;
set FRAMEWORK_ANIM_JARS=C:/ProgramData/IBM/Rational/Rhapsody/8.1.5/Share\LangJava\lib\oxf.jar;C:/ProgramData/IBM/Rational/Rhapsody/8.1.5/Share\LangJava\lib\anim.jar;C:/ProgramData/IBM/Rational/Rhapsody/8.1.5/Share\LangJava\lib\animcom.jar;C:/ProgramData/IBM/Rational/Rhapsody/8.1.5/Share\LangJava\lib\oxfInst.jar;
set SOURCEPATH=%SOURCEPATH%
set CLASSPATH=%CLASSPATH%;.
set PATH=%RHAP_JARS_DIR%;%PATH%;
set INSTRUMENTATION=None   

set BUILDSET=Debug

if %INSTRUMENTATION%==Animation goto anim

:noanim
set CLASSPATH=%CLASSPATH%;%FRAMEWORK_NONE_JARS%
goto setEnv_end

:anim
set CLASSPATH=%CLASSPATH%;%FRAMEWORK_ANIM_JARS%

:setEnv_end

if "%1" == "" goto compile
if "%1" == "build" goto compile
if "%1" == "clean" goto clean
if "%1" == "rebuild" goto clean
if "%1" == "run" goto run

:clean
echo cleaning class files
if exist controleur\ControleurCentre.class del controleur\ControleurCentre.class
if exist vue\Consomation.class del vue\Consomation.class
if exist Default\class_1.class del Default\class_1.class
if exist controleur\ControleurConsommateur.class del controleur\ControleurConsommateur.class
if exist ElecTek\Provider.class del ElecTek\Provider.class
if exist Default\Consummer.class del Default\Consummer.class
if exist vue\Facture.class del vue\Facture.class
if exist controleur\ControleurCompteur.class del controleur\ControleurCompteur.class
if exist ElecTek\RRC.class del ElecTek\RRC.class
if exist ElecTek\Consummer.class del ElecTek\Consummer.class
if exist vue\Connexion.class del vue\Connexion.class
if exist vue\choixFournisseur.class del vue\choixFournisseur.class
if exist model\CentreLecture.class del model\CentreLecture.class
if exist model\Fournisseur.class del model\Fournisseur.class
if exist controleur\ControleurPasserelle.class del controleur\ControleurPasserelle.class
if exist model\Consomateur.class del model\Consomateur.class
if exist ElecTek\Producer.class del ElecTek\Producer.class
if exist model\Passerelle.class del model\Passerelle.class
if exist MainDefaultComponent.class del MainDefaultComponent.class
if exist controleur\ControleurFournisseur.class del controleur\ControleurFournisseur.class
if exist model\Compteur.class del model\Compteur.class
if exist ElecTek\Compteur.class del ElecTek\Compteur.class
if exist vue\Accueil.class del vue\Accueil.class

if "%1" == "clean" goto end

:compile   
if %BUILDSET%==Debug goto compile_debug
echo compiling JAVA source files
javac  @files.lst
goto end

:compile_debug
echo compiling JAVA source files
javac -g  @files.lst
goto end

:run

java %2

:end


