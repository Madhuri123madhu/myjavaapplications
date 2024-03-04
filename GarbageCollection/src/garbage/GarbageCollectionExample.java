
package garbage;

//GarbageCollection:
//Garbage collection in Java is a process that automatically manages memory by reclaiming(thirigi pondhadam)
//the memoryoccupied by objects that are no longer in use by the program. In simple words, it helps
//prevent memory leaks and ensures efficient use of memory.


public class GarbageCollectionExample 
{
	public static void main(String[] args) 
	{
		 // Creating two objects
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();

        // Assigning obj2 to obj1, making obj1's original reference null
        obj1 = obj2;

        // Making both obj1 and obj2 eligible for garbage collection
        obj1 = null;
        obj2 = null;

        // At this point, the objects created above are no longer reachable and can be collected

        // Explicitly triggering garbage collection (not necessary in most cases)
        System.gc();
    }
		
	}

class MyClass
{
	
}

//In this example:
//
//.Two objects (obj1 and obj2) of the class MyClass are created.

//.The reference obj1 is assigned the value of obj2, and both references now point to the same object.
//Setting both references to null makes the original objects eligible for garbage collection since there
//are no references pointing to them.

//.The System.gc() line is an explicit request to the Java Virtual Machine (JVM) to perform garbage 
//collection. However, it's important to note that the JVM may or may not execute garbage collection 
//immediately in response to this request.

//.In a real-world scenario, the JVM automatically handles garbage collection, and developers usually 
//don't need to explicitly trigger it. The automatic garbage collection process identifies and reclaims
//memory occupied by objects that are no longer accessible, ensuring the efficient use of resources.
