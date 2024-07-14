

import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper

ArrayList<ImageData> getImages() {

    List<String> Images = new ArrayList<>()

    ObjectMapper objectMapper = new ObjectMapper()
    ArrayList<ImageData> listImage = objectMapper.readValue(new File("images.txt"), new TypeReference<List<ImageData>>(){})


    return listImage
}

List<String> getBaseNames(ArrayList<ImageData> listImage) {

    List<String> Images = new ArrayList<>()

    listImage.each {
        if(it.getNames()) {
            Images.add(it.getNames()[0])
        }
    }

    return Images

}

ObjectMapper objectMapper = new ObjectMapper()

ArrayList<ImageData> listImage = objectMapper.readValue(new File("images.txt"), new TypeReference<List<ImageData>>(){})

listImage.each { println it.names }