/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodycomplex;

import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import fixtures.bodycomplex.models.BooleanWrapper;
import fixtures.bodycomplex.models.ByteWrapper;
import fixtures.bodycomplex.models.Datetimerfc1123Wrapper;
import fixtures.bodycomplex.models.DatetimeWrapper;
import fixtures.bodycomplex.models.DateWrapper;
import fixtures.bodycomplex.models.DoubleWrapper;
import fixtures.bodycomplex.models.DurationWrapper;
import fixtures.bodycomplex.models.FloatWrapper;
import fixtures.bodycomplex.models.IntWrapper;
import fixtures.bodycomplex.models.LongWrapper;
import fixtures.bodycomplex.models.StringWrapper;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Primitives.
 */
public interface Primitives {
    /**
     * Get complex types with integer properties.
     *
     * @return the IntWrapper object if successful.
     */
    IntWrapper getInt();

    /**
     * Get complex types with integer properties.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<IntWrapper> getIntAsync(final ServiceCallback<IntWrapper> serviceCallback);

    /**
     * Get complex types with integer properties.
     *
     * @return the observable to the IntWrapper object
     */
    Observable<IntWrapper> getIntAsync();

    /**
     * Get complex types with integer properties.
     *
     * @return the observable to the IntWrapper object
     */
    Observable<ServiceResponse<IntWrapper>> getIntWithServiceResponseAsync();

    /**
     * Put complex types with integer properties.
     *
     * @param complexBody Please put -1 and 2
     */
    void putInt(IntWrapper complexBody);

    /**
     * Put complex types with integer properties.
     *
     * @param complexBody Please put -1 and 2
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> putIntAsync(IntWrapper complexBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Put complex types with integer properties.
     *
     * @param complexBody Please put -1 and 2
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> putIntAsync(IntWrapper complexBody);

    /**
     * Put complex types with integer properties.
     *
     * @param complexBody Please put -1 and 2
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> putIntWithServiceResponseAsync(IntWrapper complexBody);

    /**
     * Get complex types with long properties.
     *
     * @return the LongWrapper object if successful.
     */
    LongWrapper getLong();

    /**
     * Get complex types with long properties.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<LongWrapper> getLongAsync(final ServiceCallback<LongWrapper> serviceCallback);

    /**
     * Get complex types with long properties.
     *
     * @return the observable to the LongWrapper object
     */
    Observable<LongWrapper> getLongAsync();

    /**
     * Get complex types with long properties.
     *
     * @return the observable to the LongWrapper object
     */
    Observable<ServiceResponse<LongWrapper>> getLongWithServiceResponseAsync();

    /**
     * Put complex types with long properties.
     *
     * @param complexBody Please put 1099511627775 and -999511627788
     */
    void putLong(LongWrapper complexBody);

    /**
     * Put complex types with long properties.
     *
     * @param complexBody Please put 1099511627775 and -999511627788
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> putLongAsync(LongWrapper complexBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Put complex types with long properties.
     *
     * @param complexBody Please put 1099511627775 and -999511627788
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> putLongAsync(LongWrapper complexBody);

    /**
     * Put complex types with long properties.
     *
     * @param complexBody Please put 1099511627775 and -999511627788
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> putLongWithServiceResponseAsync(LongWrapper complexBody);

    /**
     * Get complex types with float properties.
     *
     * @return the FloatWrapper object if successful.
     */
    FloatWrapper getFloat();

    /**
     * Get complex types with float properties.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<FloatWrapper> getFloatAsync(final ServiceCallback<FloatWrapper> serviceCallback);

    /**
     * Get complex types with float properties.
     *
     * @return the observable to the FloatWrapper object
     */
    Observable<FloatWrapper> getFloatAsync();

    /**
     * Get complex types with float properties.
     *
     * @return the observable to the FloatWrapper object
     */
    Observable<ServiceResponse<FloatWrapper>> getFloatWithServiceResponseAsync();

    /**
     * Put complex types with float properties.
     *
     * @param complexBody Please put 1.05 and -0.003
     */
    void putFloat(FloatWrapper complexBody);

    /**
     * Put complex types with float properties.
     *
     * @param complexBody Please put 1.05 and -0.003
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> putFloatAsync(FloatWrapper complexBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Put complex types with float properties.
     *
     * @param complexBody Please put 1.05 and -0.003
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> putFloatAsync(FloatWrapper complexBody);

    /**
     * Put complex types with float properties.
     *
     * @param complexBody Please put 1.05 and -0.003
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> putFloatWithServiceResponseAsync(FloatWrapper complexBody);

    /**
     * Get complex types with double properties.
     *
     * @return the DoubleWrapper object if successful.
     */
    DoubleWrapper getDouble();

    /**
     * Get complex types with double properties.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<DoubleWrapper> getDoubleAsync(final ServiceCallback<DoubleWrapper> serviceCallback);

    /**
     * Get complex types with double properties.
     *
     * @return the observable to the DoubleWrapper object
     */
    Observable<DoubleWrapper> getDoubleAsync();

    /**
     * Get complex types with double properties.
     *
     * @return the observable to the DoubleWrapper object
     */
    Observable<ServiceResponse<DoubleWrapper>> getDoubleWithServiceResponseAsync();

    /**
     * Put complex types with double properties.
     *
     * @param complexBody Please put 3e-100 and -0.000000000000000000000000000000000000000000000000000000005
     */
    void putDouble(DoubleWrapper complexBody);

    /**
     * Put complex types with double properties.
     *
     * @param complexBody Please put 3e-100 and -0.000000000000000000000000000000000000000000000000000000005
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> putDoubleAsync(DoubleWrapper complexBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Put complex types with double properties.
     *
     * @param complexBody Please put 3e-100 and -0.000000000000000000000000000000000000000000000000000000005
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> putDoubleAsync(DoubleWrapper complexBody);

    /**
     * Put complex types with double properties.
     *
     * @param complexBody Please put 3e-100 and -0.000000000000000000000000000000000000000000000000000000005
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> putDoubleWithServiceResponseAsync(DoubleWrapper complexBody);

    /**
     * Get complex types with bool properties.
     *
     * @return the BooleanWrapper object if successful.
     */
    BooleanWrapper getBool();

    /**
     * Get complex types with bool properties.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<BooleanWrapper> getBoolAsync(final ServiceCallback<BooleanWrapper> serviceCallback);

    /**
     * Get complex types with bool properties.
     *
     * @return the observable to the BooleanWrapper object
     */
    Observable<BooleanWrapper> getBoolAsync();

    /**
     * Get complex types with bool properties.
     *
     * @return the observable to the BooleanWrapper object
     */
    Observable<ServiceResponse<BooleanWrapper>> getBoolWithServiceResponseAsync();

    /**
     * Put complex types with bool properties.
     *
     * @param complexBody Please put true and false
     */
    void putBool(BooleanWrapper complexBody);

    /**
     * Put complex types with bool properties.
     *
     * @param complexBody Please put true and false
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> putBoolAsync(BooleanWrapper complexBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Put complex types with bool properties.
     *
     * @param complexBody Please put true and false
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> putBoolAsync(BooleanWrapper complexBody);

    /**
     * Put complex types with bool properties.
     *
     * @param complexBody Please put true and false
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> putBoolWithServiceResponseAsync(BooleanWrapper complexBody);

    /**
     * Get complex types with string properties.
     *
     * @return the StringWrapper object if successful.
     */
    StringWrapper getString();

    /**
     * Get complex types with string properties.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<StringWrapper> getStringAsync(final ServiceCallback<StringWrapper> serviceCallback);

    /**
     * Get complex types with string properties.
     *
     * @return the observable to the StringWrapper object
     */
    Observable<StringWrapper> getStringAsync();

    /**
     * Get complex types with string properties.
     *
     * @return the observable to the StringWrapper object
     */
    Observable<ServiceResponse<StringWrapper>> getStringWithServiceResponseAsync();

    /**
     * Put complex types with string properties.
     *
     * @param complexBody Please put 'goodrequest', '', and null
     */
    void putString(StringWrapper complexBody);

    /**
     * Put complex types with string properties.
     *
     * @param complexBody Please put 'goodrequest', '', and null
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> putStringAsync(StringWrapper complexBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Put complex types with string properties.
     *
     * @param complexBody Please put 'goodrequest', '', and null
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> putStringAsync(StringWrapper complexBody);

    /**
     * Put complex types with string properties.
     *
     * @param complexBody Please put 'goodrequest', '', and null
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> putStringWithServiceResponseAsync(StringWrapper complexBody);

    /**
     * Get complex types with date properties.
     *
     * @return the DateWrapper object if successful.
     */
    DateWrapper getDate();

    /**
     * Get complex types with date properties.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<DateWrapper> getDateAsync(final ServiceCallback<DateWrapper> serviceCallback);

    /**
     * Get complex types with date properties.
     *
     * @return the observable to the DateWrapper object
     */
    Observable<DateWrapper> getDateAsync();

    /**
     * Get complex types with date properties.
     *
     * @return the observable to the DateWrapper object
     */
    Observable<ServiceResponse<DateWrapper>> getDateWithServiceResponseAsync();

    /**
     * Put complex types with date properties.
     *
     * @param complexBody Please put '0001-01-01' and '2016-02-29'
     */
    void putDate(DateWrapper complexBody);

    /**
     * Put complex types with date properties.
     *
     * @param complexBody Please put '0001-01-01' and '2016-02-29'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> putDateAsync(DateWrapper complexBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Put complex types with date properties.
     *
     * @param complexBody Please put '0001-01-01' and '2016-02-29'
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> putDateAsync(DateWrapper complexBody);

    /**
     * Put complex types with date properties.
     *
     * @param complexBody Please put '0001-01-01' and '2016-02-29'
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> putDateWithServiceResponseAsync(DateWrapper complexBody);

    /**
     * Get complex types with datetime properties.
     *
     * @return the DatetimeWrapper object if successful.
     */
    DatetimeWrapper getDateTime();

    /**
     * Get complex types with datetime properties.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<DatetimeWrapper> getDateTimeAsync(final ServiceCallback<DatetimeWrapper> serviceCallback);

    /**
     * Get complex types with datetime properties.
     *
     * @return the observable to the DatetimeWrapper object
     */
    Observable<DatetimeWrapper> getDateTimeAsync();

    /**
     * Get complex types with datetime properties.
     *
     * @return the observable to the DatetimeWrapper object
     */
    Observable<ServiceResponse<DatetimeWrapper>> getDateTimeWithServiceResponseAsync();

    /**
     * Put complex types with datetime properties.
     *
     * @param complexBody Please put '0001-01-01T12:00:00-04:00' and '2015-05-18T11:38:00-08:00'
     */
    void putDateTime(DatetimeWrapper complexBody);

    /**
     * Put complex types with datetime properties.
     *
     * @param complexBody Please put '0001-01-01T12:00:00-04:00' and '2015-05-18T11:38:00-08:00'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> putDateTimeAsync(DatetimeWrapper complexBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Put complex types with datetime properties.
     *
     * @param complexBody Please put '0001-01-01T12:00:00-04:00' and '2015-05-18T11:38:00-08:00'
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> putDateTimeAsync(DatetimeWrapper complexBody);

    /**
     * Put complex types with datetime properties.
     *
     * @param complexBody Please put '0001-01-01T12:00:00-04:00' and '2015-05-18T11:38:00-08:00'
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> putDateTimeWithServiceResponseAsync(DatetimeWrapper complexBody);

    /**
     * Get complex types with datetimeRfc1123 properties.
     *
     * @return the Datetimerfc1123Wrapper object if successful.
     */
    Datetimerfc1123Wrapper getDateTimeRfc1123();

    /**
     * Get complex types with datetimeRfc1123 properties.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Datetimerfc1123Wrapper> getDateTimeRfc1123Async(final ServiceCallback<Datetimerfc1123Wrapper> serviceCallback);

    /**
     * Get complex types with datetimeRfc1123 properties.
     *
     * @return the observable to the Datetimerfc1123Wrapper object
     */
    Observable<Datetimerfc1123Wrapper> getDateTimeRfc1123Async();

    /**
     * Get complex types with datetimeRfc1123 properties.
     *
     * @return the observable to the Datetimerfc1123Wrapper object
     */
    Observable<ServiceResponse<Datetimerfc1123Wrapper>> getDateTimeRfc1123WithServiceResponseAsync();

    /**
     * Put complex types with datetimeRfc1123 properties.
     *
     * @param complexBody Please put 'Mon, 01 Jan 0001 12:00:00 GMT' and 'Mon, 18 May 2015 11:38:00 GMT'
     */
    void putDateTimeRfc1123(Datetimerfc1123Wrapper complexBody);

    /**
     * Put complex types with datetimeRfc1123 properties.
     *
     * @param complexBody Please put 'Mon, 01 Jan 0001 12:00:00 GMT' and 'Mon, 18 May 2015 11:38:00 GMT'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> putDateTimeRfc1123Async(Datetimerfc1123Wrapper complexBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Put complex types with datetimeRfc1123 properties.
     *
     * @param complexBody Please put 'Mon, 01 Jan 0001 12:00:00 GMT' and 'Mon, 18 May 2015 11:38:00 GMT'
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> putDateTimeRfc1123Async(Datetimerfc1123Wrapper complexBody);

    /**
     * Put complex types with datetimeRfc1123 properties.
     *
     * @param complexBody Please put 'Mon, 01 Jan 0001 12:00:00 GMT' and 'Mon, 18 May 2015 11:38:00 GMT'
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> putDateTimeRfc1123WithServiceResponseAsync(Datetimerfc1123Wrapper complexBody);

    /**
     * Get complex types with duration properties.
     *
     * @return the DurationWrapper object if successful.
     */
    DurationWrapper getDuration();

    /**
     * Get complex types with duration properties.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<DurationWrapper> getDurationAsync(final ServiceCallback<DurationWrapper> serviceCallback);

    /**
     * Get complex types with duration properties.
     *
     * @return the observable to the DurationWrapper object
     */
    Observable<DurationWrapper> getDurationAsync();

    /**
     * Get complex types with duration properties.
     *
     * @return the observable to the DurationWrapper object
     */
    Observable<ServiceResponse<DurationWrapper>> getDurationWithServiceResponseAsync();

    /**
     * Put complex types with duration properties.
     *
     * @param complexBody Please put 'P123DT22H14M12.011S'
     */
    void putDuration(DurationWrapper complexBody);

    /**
     * Put complex types with duration properties.
     *
     * @param complexBody Please put 'P123DT22H14M12.011S'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> putDurationAsync(DurationWrapper complexBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Put complex types with duration properties.
     *
     * @param complexBody Please put 'P123DT22H14M12.011S'
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> putDurationAsync(DurationWrapper complexBody);

    /**
     * Put complex types with duration properties.
     *
     * @param complexBody Please put 'P123DT22H14M12.011S'
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> putDurationWithServiceResponseAsync(DurationWrapper complexBody);

    /**
     * Get complex types with byte properties.
     *
     * @return the ByteWrapper object if successful.
     */
    ByteWrapper getByte();

    /**
     * Get complex types with byte properties.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ByteWrapper> getByteAsync(final ServiceCallback<ByteWrapper> serviceCallback);

    /**
     * Get complex types with byte properties.
     *
     * @return the observable to the ByteWrapper object
     */
    Observable<ByteWrapper> getByteAsync();

    /**
     * Get complex types with byte properties.
     *
     * @return the observable to the ByteWrapper object
     */
    Observable<ServiceResponse<ByteWrapper>> getByteWithServiceResponseAsync();

    /**
     * Put complex types with byte properties.
     *
     * @param complexBody Please put non-ascii byte string hex(FF FE FD FC 00 FA F9 F8 F7 F6)
     */
    void putByte(ByteWrapper complexBody);

    /**
     * Put complex types with byte properties.
     *
     * @param complexBody Please put non-ascii byte string hex(FF FE FD FC 00 FA F9 F8 F7 F6)
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> putByteAsync(ByteWrapper complexBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Put complex types with byte properties.
     *
     * @param complexBody Please put non-ascii byte string hex(FF FE FD FC 00 FA F9 F8 F7 F6)
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> putByteAsync(ByteWrapper complexBody);

    /**
     * Put complex types with byte properties.
     *
     * @param complexBody Please put non-ascii byte string hex(FF FE FD FC 00 FA F9 F8 F7 F6)
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> putByteWithServiceResponseAsync(ByteWrapper complexBody);

}
