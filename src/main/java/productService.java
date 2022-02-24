public class productService {

    public int countByFilter(shipmentProducts shipment, filter filter){
        int counter = 0;
        for(int i = 0; i<shipment.array.length; i++){
            if(shipment.array[i].getClass() == wrappedPieceProduct.class){
                wrappedPieceProduct P = (wrappedPieceProduct) shipment.array[i];
                if(filter.apply(P.Name)){
                    counter++;
                }
            }
            if(shipment.array[i].getClass() == wrappedWeightProduct.class){
                wrappedWeightProduct P = (wrappedWeightProduct) shipment.array[i];
                if(filter.apply(P.Name)){
                    counter++;
                }

            }
            if(shipment.array[i].getClass() == wrappedSetProducts.class){
                wrappedSetProducts P = (wrappedSetProducts) shipment.array[i];
                if(filter.apply(P.Name)){
                    counter++;
                }

            }
        }
        return counter;

    }
}
