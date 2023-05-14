public class EurovisieSongfestivalPuntenTelling  
{

    public boolean isEenBigFiveLand(String land)
    {
        boolean isBigFive;

        switch (land) {
            case "Duitsland":
                isBigFive = true;
                break;
            case "Frankrijk":
                isBigFive = true;
                break;
            case "Italië":
                isBigFive = true;
                break;
            case "Spanje":
                isBigFive = true;
                break;
            case "Verenigd Koninkrijk":
                isBigFive = true;
                break;
            default:
                isBigFive = false;
                break;
        }

        return isBigFive;
    }

}