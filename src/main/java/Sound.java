import java.util.*;
public class Sound
{
  /** the array of values in this sound; guaranteed not to be null */
  int[] samples;



  /** Changes those values in this sound that have an amplitude greater than limit.
   *  Values greater than limit are changed to limit.
   *  Values less than -limit are changed to -limit.
   *  @param limit the amplitude limit
   *         Precondition: limit >= 0
   *  @return the number of values in this sound that this method changed
   */
  public int limitAmplitude(int limit)
  {  
  int num=0;
  for(int i=0;i<samples.length;i++){
    if(samples[i]>limit){
      samples[i]=limit;
      num++;
    }
    if(samples[i]<0-limit){
      samples[i]=0-limit;
      num++;
    }
  }
    return num;
  }



  /** Removes all silence from the beginning of this sound.
   *  Silence is represented by a value of 0.
   *  Precondition: samples contains at least one nonzero value
   *  Postcondition: the length of samples reflects the removal of starting silence
   */
  public void trimSilenceFromBeginning()
  {
    int num=0;
    int ind=0;
    while(samples[ind]==0){
      num++;
      ind++;
    }
    int[] list=new int[samples.length-num];
    int ind2=0;
    for(int i=num+1;i<samples.length;i++){
      list[ind2]=samples[i];
      ind2++;
    }samples=list;
  }
}
