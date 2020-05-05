public class MergeSorter
{
  private Item[] a;
  
  public MergeSorter(Item[] anItem)
  {
    a = anItem;
  }

  public void sort()
  {
    if (a.length <= 1)
    {
      return;
    }

    Item[] first = new Item[a.length / 2];
    Item[] second = new Item[a.length - first.length];

    System.arraycopy(a, 0, first, 0, first.length);
    System.arraycopy(a, first.length, second, 0, second.length);

    MergeSorter firstSorter = new MergeSorter(first);
    MergeSorter secondSorter = new MergeSorter(second);

    firstSorter.sort();
    secondSorter.sort();

    merge(first, second);
  }
  
  private void merge(Item[] first, Item[] second)
  {
    int iFirst = 0; // next element to consider in the first array
    int iSecond = 0; // next element to consider in the second array
    int j = 0; // next open position in a
    
    while (iFirst < first.length && iSecond < second.length)
    {
      if (first[iFirst].getKey().compareTo(second[iSecond].getKey()) < 0)
      {
        a[j] = first[iFirst];
        iFirst++;
      }
      else
      {
        a[j] = second[iSecond];
        iSecond++;
      }
      j++;
    }
    System.arraycopy(first, iFirst, a, j, first.length - iFirst);
    System.arraycopy(second, iSecond, a, j, second.length - iSecond);
  }
}
