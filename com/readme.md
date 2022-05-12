// array is based on indexposition
// arraylist is adjustable size
// it increases the value to 50%
// Linked list is doubly linked list
// element is called as node in linlkedlist
array list
if i want ot insert the value in index position it shifts the value directly
position changes when we add or delete element from the list
if the list is big it take so much time
// store ayina value retrieve cheyadaniki
linkedList
very begining no value that is called head
previous value address
present value 
next value address
very last node no value is called tail
only changes the link of previous value and present value and next value
insertion and deletion value
we dont have index position 
linkedList methods:
add()
add(index, element)
in linked list we dont have index position but if we want to use
the we can give add(5,"djdj");
in this case it reads first element then second and third and fourth and fifth then prints the value if we use index position
addFirst()
addLast()
clear()
get()
getFirst()
getLast()
remove()
removeFirst()
removeLast()
// difference between arrayLIst and vector
vector is synchronized
vector is thread safe
capacity we can customize
arraylist
because if we have 10  elements it checks first element the after that 2 and 3
arraylist is non-synchronized it checks random access so we can access values easily
it is not thread safe

stack:
lifo 
whatever we inserted at last it pops out first
pop,push,search,empty,peel

set
insertion order is not preserved
random out it gives
duplicates are not preserved(unique)
set does not contain index position

// hashset
non synchronized
not threasafe
it uses hashtable-hashc0de--- for search perform usage initial capacity is 16 and 
it doubles if the capacity is increased
we have leadfactor in hashset
25 percent ayaka capacity increase cheyala 
50 percent ayaka capacity increase cheyala 
75 percent ayaka capacity increase cheyala
we can do it according to our need
by default leadfactor is 0.
it is called hasing

add,remove,clear, contains, isempty, get
duplicates are not allowed in hashset

// linkedhashset ---> hashtables +doublylinked 
// insertion order is preserved and duplicates are not allowed

Tresset-->
duplicates are not allowed and insertion or if we want in ascending or descending order then use treeset
retrieve or value access performance is high
methods in treeset
first()
last()
edyna value pass chestanu danikanna ekkuva or takkuva values print avvali it is possible with tree set
headSet()
tailSet()
in between use subset(2,4)

set  hashset linkedhashset treeset
      unordered  order     sort
        no        no        no
        no        no        no
        hashtable   hashtable+doublylinkedlist    balancedtree
         16          16                             n0 capacity


map
we only storing value in the list and set interface
but to store key and value  go for map
hashmap
LinkedHashMap
TreeMap
HashTable

key should be unique but values not be unique so duplicate values we
  map
key ----------- value
  unique----------duplicate
   101              raju
   102              ravi
   103              raj
hashmap----> values ni output lo print chesinapudu same order lo print avvadhu
                insertion order is not preserved
      key+value=entry
      
LinkedHashMap --> follows insertion order only difference between HashMap and LinkedHashMap
TreeMap keys no duplicate

HashMap 16 Hashtable
Linked  16 Hashtable+double linked list

Tree ---  no capacity red black tree
Hashtable 11   hashtable
Map--- non synchronized  but hashtable is synchronized

important Methods
Collections class we have static methods
 
