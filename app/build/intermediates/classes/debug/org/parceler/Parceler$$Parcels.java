
package org.parceler;

import java.util.HashMap;
import java.util.Map;
import amrasabic.bitcamp.ba.bitbooking.model.Hotel;
import amrasabic.bitcamp.ba.bitbooking.model.Hotel$$Parcelable;
import amrasabic.bitcamp.ba.bitbooking.model.Image;
import amrasabic.bitcamp.ba.bitbooking.model.Image$$Parcelable;
import amrasabic.bitcamp.ba.bitbooking.model.Price;
import amrasabic.bitcamp.ba.bitbooking.model.Price$$Parcelable;
import amrasabic.bitcamp.ba.bitbooking.model.Room;
import amrasabic.bitcamp.ba.bitbooking.model.Room$$Parcelable;
import amrasabic.bitcamp.ba.bitbooking.model.User;
import amrasabic.bitcamp.ba.bitbooking.model.User$$Parcelable;

@Generated(value = "org.parceler.ParcelAnnotationProcessor", date = "2015-11-11T23:52+0100")
public class Parceler$$Parcels
    implements Repository<org.parceler.Parcels.ParcelableFactory>
{

    private final Map<Class, org.parceler.Parcels.ParcelableFactory> map$$0 = new HashMap<Class, org.parceler.Parcels.ParcelableFactory>();

    public Parceler$$Parcels() {
        map$$0 .put(User.class, new Parceler$$Parcels.User$$Parcelable$$0());
        map$$0 .put(Price.class, new Parceler$$Parcels.Price$$Parcelable$$0());
        map$$0 .put(Hotel.class, new Parceler$$Parcels.Hotel$$Parcelable$$0());
        map$$0 .put(Room.class, new Parceler$$Parcels.Room$$Parcelable$$0());
        map$$0 .put(Image.class, new Parceler$$Parcels.Image$$Parcelable$$0());
    }

    public Map<Class, org.parceler.Parcels.ParcelableFactory> get() {
        return map$$0;
    }

    private final static class Hotel$$Parcelable$$0
        implements org.parceler.Parcels.ParcelableFactory<Hotel>
    {


        @Override
        public Hotel$$Parcelable buildParcelable(Hotel input) {
            return new Hotel$$Parcelable(input);
        }

    }

    private final static class Image$$Parcelable$$0
        implements org.parceler.Parcels.ParcelableFactory<Image>
    {


        @Override
        public Image$$Parcelable buildParcelable(Image input) {
            return new Image$$Parcelable(input);
        }

    }

    private final static class Price$$Parcelable$$0
        implements org.parceler.Parcels.ParcelableFactory<Price>
    {


        @Override
        public Price$$Parcelable buildParcelable(Price input) {
            return new Price$$Parcelable(input);
        }

    }

    private final static class Room$$Parcelable$$0
        implements org.parceler.Parcels.ParcelableFactory<Room>
    {


        @Override
        public Room$$Parcelable buildParcelable(Room input) {
            return new Room$$Parcelable(input);
        }

    }

    private final static class User$$Parcelable$$0
        implements org.parceler.Parcels.ParcelableFactory<User>
    {


        @Override
        public User$$Parcelable buildParcelable(User input) {
            return new User$$Parcelable(input);
        }

    }

}
