# Enterprise-Java-Development-1.08
IntArrayList:

efficient if you require a list that can be resized and anticipate frequently changing its size. Good for repeatedly adding, removing, or changing items. Suitable for single-threaded situations; does not worry about thread safety.

IntVector:

efficient when several threads must interact with the list at once. makes guarantee that concurrent actions are thread-safe. Due to synchronization overhead, slightly slower than IntArrayList, but safer for multi-threaded application. Simply put, use IntArrayList if you need a flexible list that can readily alter size and you're working in a single-threaded environment. utilize IntVector even though it's a little slower if you require a list that several threads can utilize safely at once
