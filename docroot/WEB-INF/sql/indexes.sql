create index IX_E980EE68 on CONFERENCE_Speaker (groupId);
create index IX_B6B8D027 on CONFERENCE_Speaker (groupId, name);
create index IX_F94EFAF2 on CONFERENCE_Speaker (uuid_);
create index IX_68D91DF6 on CONFERENCE_Speaker (uuid_, companyId);
create unique index IX_E6DCA9F8 on CONFERENCE_Speaker (uuid_, groupId);