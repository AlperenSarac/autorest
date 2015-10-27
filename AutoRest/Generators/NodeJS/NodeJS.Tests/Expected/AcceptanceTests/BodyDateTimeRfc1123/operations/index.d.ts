/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.12.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
*/

import { ServiceClientOptions, RequestOptions, ServiceCallback } from 'ms-rest';
import * as models from '../models';


/**
 * @class
 * Datetimerfc1123
 * __NOTE__: An instance of this class is automatically created for an
 * instance of the AutoRestRFC1123DateTimeTestService.
 */
export interface Datetimerfc1123 {

    /**
     * Get null datetime value
     *
     * @param {object} [options]
     *
     * @param {object} [options.customHeaders] headers that will be added to
     * request
     *
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    getNull(options: RequestOptions, callback: ServiceCallback<Date>): void;
    getNull(callback: ServiceCallback<Date>): void;

    /**
     * Get invalid datetime value
     *
     * @param {object} [options]
     *
     * @param {object} [options.customHeaders] headers that will be added to
     * request
     *
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    getInvalid(options: RequestOptions, callback: ServiceCallback<Date>): void;
    getInvalid(callback: ServiceCallback<Date>): void;

    /**
     * Get overflow datetime value
     *
     * @param {object} [options]
     *
     * @param {object} [options.customHeaders] headers that will be added to
     * request
     *
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    getOverflow(options: RequestOptions, callback: ServiceCallback<Date>): void;
    getOverflow(callback: ServiceCallback<Date>): void;

    /**
     * Get underflow datetime value
     *
     * @param {object} [options]
     *
     * @param {object} [options.customHeaders] headers that will be added to
     * request
     *
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    getUnderflow(options: RequestOptions, callback: ServiceCallback<Date>): void;
    getUnderflow(callback: ServiceCallback<Date>): void;

    /**
     * Put max datetime value Fri, 31 Dec 9999 23:59:59 GMT
     *
     * @param {date} datetimeBody
     * 
     * @param {object} [options]
     *
     * @param {object} [options.customHeaders] headers that will be added to
     * request
     *
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    putUtcMaxDateTime(datetimeBody: Date, options: RequestOptions, callback: ServiceCallback<void>): void;
    putUtcMaxDateTime(datetimeBody: Date, callback: ServiceCallback<void>): void;

    /**
     * Get max datetime value fri, 31 dec 9999 23:59:59 gmt
     *
     * @param {object} [options]
     *
     * @param {object} [options.customHeaders] headers that will be added to
     * request
     *
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    getUtcLowercaseMaxDateTime(options: RequestOptions, callback: ServiceCallback<Date>): void;
    getUtcLowercaseMaxDateTime(callback: ServiceCallback<Date>): void;

    /**
     * Get max datetime value FRI, 31 DEC 9999 23:59:59 GMT
     *
     * @param {object} [options]
     *
     * @param {object} [options.customHeaders] headers that will be added to
     * request
     *
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    getUtcUppercaseMaxDateTime(options: RequestOptions, callback: ServiceCallback<Date>): void;
    getUtcUppercaseMaxDateTime(callback: ServiceCallback<Date>): void;

    /**
     * Put min datetime value Mon, 1 Jan 0001 00:00:00 GMT
     *
     * @param {date} datetimeBody
     * 
     * @param {object} [options]
     *
     * @param {object} [options.customHeaders] headers that will be added to
     * request
     *
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    putUtcMinDateTime(datetimeBody: Date, options: RequestOptions, callback: ServiceCallback<void>): void;
    putUtcMinDateTime(datetimeBody: Date, callback: ServiceCallback<void>): void;

    /**
     * Get min datetime value Mon, 1 Jan 0001 00:00:00 GMT
     *
     * @param {object} [options]
     *
     * @param {object} [options.customHeaders] headers that will be added to
     * request
     *
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    getUtcMinDateTime(options: RequestOptions, callback: ServiceCallback<Date>): void;
    getUtcMinDateTime(callback: ServiceCallback<Date>): void;
}