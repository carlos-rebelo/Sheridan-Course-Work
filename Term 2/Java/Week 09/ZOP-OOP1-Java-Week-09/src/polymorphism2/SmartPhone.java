package polymorphism2;

public class SmartPhone implements Phone, Camera, AudioPlayer //we will make SmartPhone implement Phone, Camera, AudioPlayer 
{

    @Override
    public void makeCall(int number)
    {
        System.out.println("Making call");
    }

    @Override
    public void answerCall()
    {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'answerCall'");
    }

    @Override
    public void lookupContact()
    {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'lookupContact'");
    }

    @Override
    public void autoFocus()
    {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'autoFocus'");
    }

    @Override
    public void takePhoto()
    {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'takePhoto'");
    }

    @Override
    public void deletePhoto()
    {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deletePhoto'");
    }

    @Override
    public void zoom(int percent)
    {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'zoom'");
    }

    @Override
    public void playSong()
    {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'playSong'");
    }

    @Override
    public void playPlayList()
    {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'playPlayList'");
    }

    @Override
    public void skipToNextSong()
    {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'skipToNextSong'");
    }

    @Override
    public void setVolume(int volume)
    {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setVolume'");
    }

}
