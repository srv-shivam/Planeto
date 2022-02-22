package com.example.planeto

import android.os.Parcel
import android.os.Parcelable

data class PlanetData(
    val id: Int,
    val planetImage: Int,
    val title: String,
    val galaxy: String,
    val distance: String,
    val gravity: String,
    val overview: String
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readInt(),
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!
    ) {
    }

    override fun describeContents(): Int {
        return 0
    }

    override fun writeToParcel(dest: Parcel?, flags: Int) {
        dest!!.writeInt(id)
        dest.writeInt(planetImage)
        dest.writeString(title)
        dest.writeString(galaxy)
        dest.writeString(distance)
        dest.writeString(gravity)
        dest.writeString(overview)
    }

    companion object CREATOR : Parcelable.Creator<PlanetData> {
        override fun createFromParcel(parcel: Parcel): PlanetData {
            return PlanetData(parcel)
        }

        override fun newArray(size: Int): Array<PlanetData?> {
            return arrayOfNulls(size)
        }
    }

}
