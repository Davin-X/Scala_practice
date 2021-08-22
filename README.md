# How to Install and Run PySpark in Jupyter Notebook on Windows
=>When I write PySpark code, I use Jupyter notebook to run my code. In this, I will show you how to install and run PySpark locally in Jupyter Notebook on Windows.
Items needed Spark distribution from spark.apache.org
download Spark => https://archive.apache.org/dist/spark/spark-2.4.4/spark-2.4.4-bin-hadoop2.7.tgz

 //* my set up = 
anaconda ( jupyter setup with python), 
**python 3.7 ** 
**spark-2.4.4-bin-hadoop2.7  having scala 2.11.12**
*//

winutils.exe — a Hadoop binary for Windows — from Steve Loughran’s GitHub repo. Go to the corresponding Hadoop version in the Spark distribution and find winutils.exe under /bin. For example, https://github.com/steveloughran/winutils/blob/master/hadoop-2.7.1/bin/winutils.exe .

download winutils => https://github.com/steveloughran/winutils


If you don’t have Java or your Java version is 7.x or less, download and install Java from Oracle. I recommend getting the latest JDK (version 1.8)

download java => https://www.oracle.com/in/java/technologies/javase/javase-jdk8-downloads.html

If you don’t know how to unpack a .tgz file on Windows, you can download and install 7-zip on Windows to unpack the .tgz file from Spark distribution in item 1 by right-clicking on the file icon and select 7-zip > Extract Here.

download 7zip => https://www.7-zip.org/

Installing spark  After getting all the items, let’s set up Spark.

Unpack the .tgz file. For example, I unpacked with 7zip from step A6 and put mine under C:\LOCAL_SPARK

unzip tar

Move the winutils.exe downloaded to the \bin folder of Spark distribution. For example, C:\LOCAL_SPARK\spark-2.4.4-bin-hadoop2.7\bin\winutils.exe

Add environment variables: the environment variables let Windows find where the files are when we start the Spark kernel. You can find the environment variable settings by putting “environ…” in the search box.

The variables to add are, in my example,

Name           Value 
SPARK_HOME    C:\LOCAL_SPARK\spark-2.4.4-bin-hadoop2.7 HADOOP_HOME C:\LOCAL_SPARK\spark-2.4.4-bin-hadoop2.7 

In the same environment variable settings window, look for the Path or PATH variable, click edit and add %SPARK_HOME%\bin to it.

(Optional, if see Java related error in step C) Find the installed Java JDK folder from step A5, for example, C:\Program Files\Java\jdk1.8.0_251, and add the following environment variable

Name Value JAVA_HOME C:\Program Files\Java\jdk1.8.0_251

1- install anaconda 
  Installing on Windows = https://docs.anaconda.com/anaconda/install/windows/

    //cahnged python 3.8 to 3.7 
    conda install python=3.7
    conda clean -a 

2- install spark in windows 
  refer = https://phoenixnap.com/kb/install-spark-on-windows-10
  
  
3- install spylon kernel for jupyter note-book

     # Step 1: Install spylon kernel
       pip install spylon-kernel

     # Step 2: create a kernel spec
      python -m spylon_kernel install

    # Step 3: start jupyter notebook 
     jupyter notebook

    # Step 4: create a new  spylon note-book  
  
  
 Alternative 
  ==============================================================================================
  if you are confortable with intellij for scala developement 
 Installing and setting up Intellij for scala 
 https://www.jetbrains.com/help/idea/discover-intellij-idea-for-scala.html#scala_plugin
 
 
