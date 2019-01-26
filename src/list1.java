import java.util.Scanner;
import static java.lang.System.exit;

 class list1
 {

   static int a[] = new int[5];
   static int i = 0;

    public void add(int v1)
    {
    a[i] = v1;
    System.out.println("VALUE INSERTED\n");
    i++;
    }

    public void remove(int p1)
    {
    if (p1 > i)
    {
    System.out.println("Position is greater than element in a list.Enter valid position.\n");
    }

    else
    {
    if (p1 == i)
    a[i - 1] = 0;

    else
    {
    for (int j = p1; j < a.length; j++)
    a[j - 1] = a[j];
    }

    System.out.println("VALUE REMOVED\n");
    i--;
    }
    }

    public void show()
    {
    for (int j = 0; j < i; j++)
    {
    System.out.println(a[j]);
    }
    System.out.println();
    }

    public boolean isEmpty()
    {
    if (i == 0)
    return true;
    else
    return false;
    }

    public boolean isFull()
    {
    if (i >= a.length)
    return true;
    else
    return false;
    }


    public static void main (String[] args)
    {
     int n;
     Scanner x = new Scanner(System.in);
     list1 obj = new list1();
     for(int j= 0; ;j++)
     {
      System.out.println("Enter any number :\n" +
      "1 - To insert the value\t\t\t\t" +
      "2 - To remove any value\n" +
      "3 - To print the list\t\t\t\t" +
      "4 - To check list is Empty or not\n" +
      "5 - To check list is Full or not\t" +
      "6 - To exit\n");
      n = x.nextInt();
      switch (n)
      {
      case 1:
      if (obj.isFull())
      {
          System.out.println(i);
      System.out.println("LIST IS FULL\n");
      break;
      }
      else
      {
      System.out.println("Enter element which you want to insert");
      int v = x.nextInt();
      obj.add(v);
      break;
      }
      case 2:
      if(i == 0)
      {
      System.out.println("LIST IS EMPTY\n");
      break;
      }
      else
      {
      System.out.println("Enter the position whose value you want to remove");
      int p = x.nextInt();
      obj.remove(p);
      break;
      }
      case 3:
      if (i == 0)
      {
      System.out.println("LIST IS EMPTY\n");
      break;
      }
      else
      {
      System.out.println("LIST IS");
      obj.show();
      break;
      }
      case 4:
      System.out.println(obj.isEmpty() ? "LIST IS EMPTY\n" : "LIST IS NOT EMPTY\n");
      break;
      case 5:
      System.out.println(obj.isFull() ? "LIST IS FULL\n" : "LIST IS NOT FULL\n");
      break;
      case 6:
      exit(0);
      break;
      default:
      System.out.println("INVALID CHOICE\n");
      break;
      }
     }
    }
 }
