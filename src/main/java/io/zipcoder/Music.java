package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        //counter to count the forward flip
        Integer counter = 0;
//counter to count the rearranged flip
        Integer counter2 = 0;
//counter to keep track of the position in the array rearrange
        int count = 0;
//position of the original array for the rearrange
        int pos = startIndex;
        String[] rearrangedPlaylist = new String[playList.length];
//flip through the playlist forwards until you reach the selected song
        for(int i = startIndex; i < playList.length; i++){
            if(playList[i].equals(selection)){
                break;
            }
            counter++;
        }
        for(int i = startIndex; i < rearrangedPlaylist.length; i++){
            if(count == 0) {
                rearrangedPlaylist[count] = playList[pos];
            }else if(pos == 0){
                rearrangedPlaylist[count] = playList[pos];
            }else if(pos < 0) {
                pos = playList.length-1;
                rearrangedPlaylist[count] = playList[pos];
            }else if(pos != 0){
                rearrangedPlaylist[count] = playList[pos];
            }
            pos--;
            count++;
        }
        for(int i = 0; i < rearrangedPlaylist.length; i++){
            if(rearrangedPlaylist[i].equals(selection)){
                break;
            }
            counter2++;
        }
        if(counter>counter2){
            counter = counter2;
        }

        return counter;
    }
}
