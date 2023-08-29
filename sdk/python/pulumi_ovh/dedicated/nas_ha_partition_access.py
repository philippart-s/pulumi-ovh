# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['NasHAPartitionAccessArgs', 'NasHAPartitionAccess']

@pulumi.input_type
class NasHAPartitionAccessArgs:
    def __init__(__self__, *,
                 ip: pulumi.Input[str],
                 partition_name: pulumi.Input[str],
                 service_name: pulumi.Input[str],
                 type: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a NasHAPartitionAccess resource.
        :param pulumi.Input[str] ip: ip block in x.x.x.x/x format
        :param pulumi.Input[str] partition_name: name of the partition
        :param pulumi.Input[str] service_name: The internal name of your HA-NAS (it has to be ordered via OVHcloud interface)
        :param pulumi.Input[str] type: one of "readwrite", "readonly"
        """
        pulumi.set(__self__, "ip", ip)
        pulumi.set(__self__, "partition_name", partition_name)
        pulumi.set(__self__, "service_name", service_name)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def ip(self) -> pulumi.Input[str]:
        """
        ip block in x.x.x.x/x format
        """
        return pulumi.get(self, "ip")

    @ip.setter
    def ip(self, value: pulumi.Input[str]):
        pulumi.set(self, "ip", value)

    @property
    @pulumi.getter(name="partitionName")
    def partition_name(self) -> pulumi.Input[str]:
        """
        name of the partition
        """
        return pulumi.get(self, "partition_name")

    @partition_name.setter
    def partition_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "partition_name", value)

    @property
    @pulumi.getter(name="serviceName")
    def service_name(self) -> pulumi.Input[str]:
        """
        The internal name of your HA-NAS (it has to be ordered via OVHcloud interface)
        """
        return pulumi.get(self, "service_name")

    @service_name.setter
    def service_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "service_name", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        one of "readwrite", "readonly"
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


@pulumi.input_type
class _NasHAPartitionAccessState:
    def __init__(__self__, *,
                 ip: Optional[pulumi.Input[str]] = None,
                 partition_name: Optional[pulumi.Input[str]] = None,
                 service_name: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering NasHAPartitionAccess resources.
        :param pulumi.Input[str] ip: ip block in x.x.x.x/x format
        :param pulumi.Input[str] partition_name: name of the partition
        :param pulumi.Input[str] service_name: The internal name of your HA-NAS (it has to be ordered via OVHcloud interface)
        :param pulumi.Input[str] type: one of "readwrite", "readonly"
        """
        if ip is not None:
            pulumi.set(__self__, "ip", ip)
        if partition_name is not None:
            pulumi.set(__self__, "partition_name", partition_name)
        if service_name is not None:
            pulumi.set(__self__, "service_name", service_name)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def ip(self) -> Optional[pulumi.Input[str]]:
        """
        ip block in x.x.x.x/x format
        """
        return pulumi.get(self, "ip")

    @ip.setter
    def ip(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ip", value)

    @property
    @pulumi.getter(name="partitionName")
    def partition_name(self) -> Optional[pulumi.Input[str]]:
        """
        name of the partition
        """
        return pulumi.get(self, "partition_name")

    @partition_name.setter
    def partition_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "partition_name", value)

    @property
    @pulumi.getter(name="serviceName")
    def service_name(self) -> Optional[pulumi.Input[str]]:
        """
        The internal name of your HA-NAS (it has to be ordered via OVHcloud interface)
        """
        return pulumi.get(self, "service_name")

    @service_name.setter
    def service_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "service_name", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        one of "readwrite", "readonly"
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


class NasHAPartitionAccess(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 ip: Optional[pulumi.Input[str]] = None,
                 partition_name: Optional[pulumi.Input[str]] = None,
                 service_name: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a resource for managing access rights to partitions on HA-NAS services

        ## Example Usage

        ## Import

        HA-NAS partition access can be imported using the `{service_name}/{partition_name}/{ip}`, e.g.   <break><break>```sh<break> $ pulumi import ovh:Dedicated/nasHAPartitionAccess:NasHAPartitionAccess my-partition zpool-12345/my-partition/123.123.123.123%2F32` <break>```<break><break>

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] ip: ip block in x.x.x.x/x format
        :param pulumi.Input[str] partition_name: name of the partition
        :param pulumi.Input[str] service_name: The internal name of your HA-NAS (it has to be ordered via OVHcloud interface)
        :param pulumi.Input[str] type: one of "readwrite", "readonly"
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: NasHAPartitionAccessArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a resource for managing access rights to partitions on HA-NAS services

        ## Example Usage

        ## Import

        HA-NAS partition access can be imported using the `{service_name}/{partition_name}/{ip}`, e.g.   <break><break>```sh<break> $ pulumi import ovh:Dedicated/nasHAPartitionAccess:NasHAPartitionAccess my-partition zpool-12345/my-partition/123.123.123.123%2F32` <break>```<break><break>

        :param str resource_name: The name of the resource.
        :param NasHAPartitionAccessArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(NasHAPartitionAccessArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 ip: Optional[pulumi.Input[str]] = None,
                 partition_name: Optional[pulumi.Input[str]] = None,
                 service_name: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = NasHAPartitionAccessArgs.__new__(NasHAPartitionAccessArgs)

            if ip is None and not opts.urn:
                raise TypeError("Missing required property 'ip'")
            __props__.__dict__["ip"] = ip
            if partition_name is None and not opts.urn:
                raise TypeError("Missing required property 'partition_name'")
            __props__.__dict__["partition_name"] = partition_name
            if service_name is None and not opts.urn:
                raise TypeError("Missing required property 'service_name'")
            __props__.__dict__["service_name"] = service_name
            __props__.__dict__["type"] = type
        super(NasHAPartitionAccess, __self__).__init__(
            'ovh:Dedicated/nasHAPartitionAccess:NasHAPartitionAccess',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            ip: Optional[pulumi.Input[str]] = None,
            partition_name: Optional[pulumi.Input[str]] = None,
            service_name: Optional[pulumi.Input[str]] = None,
            type: Optional[pulumi.Input[str]] = None) -> 'NasHAPartitionAccess':
        """
        Get an existing NasHAPartitionAccess resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] ip: ip block in x.x.x.x/x format
        :param pulumi.Input[str] partition_name: name of the partition
        :param pulumi.Input[str] service_name: The internal name of your HA-NAS (it has to be ordered via OVHcloud interface)
        :param pulumi.Input[str] type: one of "readwrite", "readonly"
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _NasHAPartitionAccessState.__new__(_NasHAPartitionAccessState)

        __props__.__dict__["ip"] = ip
        __props__.__dict__["partition_name"] = partition_name
        __props__.__dict__["service_name"] = service_name
        __props__.__dict__["type"] = type
        return NasHAPartitionAccess(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def ip(self) -> pulumi.Output[str]:
        """
        ip block in x.x.x.x/x format
        """
        return pulumi.get(self, "ip")

    @property
    @pulumi.getter(name="partitionName")
    def partition_name(self) -> pulumi.Output[str]:
        """
        name of the partition
        """
        return pulumi.get(self, "partition_name")

    @property
    @pulumi.getter(name="serviceName")
    def service_name(self) -> pulumi.Output[str]:
        """
        The internal name of your HA-NAS (it has to be ordered via OVHcloud interface)
        """
        return pulumi.get(self, "service_name")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[Optional[str]]:
        """
        one of "readwrite", "readonly"
        """
        return pulumi.get(self, "type")
