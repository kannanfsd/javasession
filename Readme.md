Java API
-----------
Java SE API		Java EE API		Java ME API
(Core Java)		(Advanced Java)		(Embedded Java)

Build-in Structure - I
---------------------
class ClassName {
  declared variables (fields);
  defined methods;
  abstract method; // Is this possible here? No
} 

declared variables
	|
---------------------------
|			   |	
primitive		Reference 		Wrapper
variables		variables		class
--------------------------------------------------------------
boolean			String name;		Boolean flag;
byte			Thread t;		Byte b1;	
short			Customer c;		Short s1;
int			Employee e;		Integer data;
long			Student s;		Long l1;
float						Float f1;
double						Double d1;
char						Character c1;

static


Build-in Structure - II (Abstract class)
-----------------------

abstract class ClassName {
 variable/field declaration;
 method definition;
 abstract method; //Is this mandatory? No 
}

Build-in Structure - III (Interface)
----------------------------------

interface RBI {		interface SEBI {
 	
}			}

class SBI implements RBI, SEBI {

}

class ICICI implement RBI {
	sb Ac()
}
class ICICIDirect extends ICICI implements SEBI {
	demat Ac()
}

1. File Name shoule be InterfaceName.java
2. Until Java version 1.7
	- final static variables
	- abstract methods
   Java version 1.8>
	- final static variables
	- abstract methods
	- define static method (concrete method)
	- define default method (concrete method)

	
interface Shape {
  double pi=3.14;	// compilation error
  void display() {	// compilation error
  }
}

Exception Handling
-----------------------

num/0 		---> ArithmeticException

open a file	---> FileNotFoundException

In array	---> ArrayIndexOutOfBoundException
a[10] 

int a;		---> NumberFormatException
12.56

option-I	try, catch, finally
option-II	throws	

Java API
	Throwable - java.lang
	    |
 --------------------------------------------------------
|							|
Exception						Error
|__IOException						|__OutOfMemoryError
|__SQLException						|__StackOverflowError
|__InterruptedException					|__VirtualMachineError
|__ClassNotFoundException
|__RuntimeException
   |__ArithmeticException
   |__NullPointerException
   |__IndexOutOfBoundException
      |__ArrayIndexOutOfBoundException
      |__StringIndexOutOfBoundException

throws / throw - keyword

return-type method-name(argument-lis)throws Exception-Name {

}

MultiThread
------------
Process vs Thread

Process-based multitasking
Thread-based multitasking

Thread in Java
----------------

process-1
 t1-->t2-->t3 

process-2

process-3

java.lang.Thread(c)

How to create a Thread 			- Thread.currentThread()
How to set name of the thread		- setName(String name)
How check priority value		- setPriority(int)
MIN_PRIORITY	- 1
NORM_PRIORITY	- 5 (By Default)
MAX_PRIORITY	- 10

java.lang.Runnable(i)
	  |__ run()






