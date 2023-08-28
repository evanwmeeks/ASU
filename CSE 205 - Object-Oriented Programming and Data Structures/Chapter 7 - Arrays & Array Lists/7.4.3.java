public class Numbers
{
   public static int zeroesDistance(double[] values)
   {
      int firstPos = 0;
      int lastPos = values.length - 1;
      boolean found = false;
      while (firstPos < values.length && !found)
      
     {
        if(values[firstPos]==0 && values[lastPos]==0)
            {
                found = true;
            }
            if(values[firstPos]!=0)
            {
                firstPos++;
            }
            if(lastPos>=0)
            {
                if(values[lastPos]!=0 )
                {
                    lastPos--;
                }
            }
           
            
        
      if(firstPos == values.length && lastPos==-1)
        {
            return -1;
        }
}

      return lastPos - firstPos;
   }
}